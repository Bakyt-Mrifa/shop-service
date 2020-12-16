package kg.megacom.shopservice.services.impl;

import kg.megacom.shopservice.database.OperationRepo;
import kg.megacom.shopservice.mappers.OperationDetailMapper;
import kg.megacom.shopservice.models.dto.OperationDetailDto;
import kg.megacom.shopservice.models.dto.OperationDto;
import kg.megacom.shopservice.models.entity.Operation;
import kg.megacom.shopservice.models.responses.Responses;
import kg.megacom.shopservice.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OperationServiceImpl implements OperationService {
    private Responses responses;

    @Autowired
    private OperationRepo operationRepo;

    @Override
    public Responses createOperation(List<OperationDetailDto> operationDetailDtoList) {

        Operation operation=new Operation();
        operation.setOperationDate(new Date());
        double totalcost=operationDetailDtoList.stream().collect(Collectors.summingDouble(x->x.getTotalCost()));
        operation.setTotalCost(totalcost);


        return null;
    }
}
