package kg.megacom.shopservice.services.impl;

import kg.megacom.shopservice.database.OperationDetailRepo;
import kg.megacom.shopservice.mappers.OperationDetailMapper;
import kg.megacom.shopservice.models.dto.OperationDetailDto;
import kg.megacom.shopservice.models.entity.OperationDetail;
import kg.megacom.shopservice.models.responses.Responses;
import kg.megacom.shopservice.services.OperationDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperationDetailServiceImpl implements OperationDetailService {
    private Responses responses;
    @Autowired
    private OperationDetailRepo operationDetailRepo;

    @Override
    public Responses save(OperationDetailDto operationDetailDto) {

        OperationDetail operationDetail = operationDetailRepo.findById(operationDetailDto.getId()).orElse(null);

        if (operationDetail==null){
            operationDetail=operationDetailRepo.save(OperationDetailMapper.INSTANCE.toOperationDetail(operationDetailDto));
        }

        if (operationDetail.getGoods().getId() == (operationDetailDto.getGoods().getId())){
            operationDetail.setAmount(operationDetail.getAmount()+ operationDetailDto.getAmount());
            operationDetail.setTotalCost(operationDetail.getCost().getPrice()*operationDetail.getAmount());
        }
        operationDetail=operationDetailRepo.save(OperationDetailMapper.INSTANCE.toOperationDetail(operationDetailDto));
        responses=Responses.operationSuccess();
        responses.setObject(OperationDetailMapper.INSTANCE.toOperationDetailDto(operationDetail));

        return responses;
    }

    @Override
    public List<OperationDetailDto> operationDetailList(OperationDetailDto operationDetailDto) {
        List<OperationDetail> operationDetails=new ArrayList<>();
        operationDetails.add (OperationDetailMapper.INSTANCE.toOperationDetail(operationDetailDto));
       return OperationDetailMapper.INSTANCE.toOperationDetailDtoList(operationDetails);
    }

}
