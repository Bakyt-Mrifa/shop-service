package kg.megacom.shopservice.mappers;

import kg.megacom.shopservice.models.dto.OperationDetailDto;
import kg.megacom.shopservice.models.entity.OperationDetail;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OperationDetailMapper {
    OperationDetailMapper INSTANCE= Mappers.getMapper(OperationDetailMapper.class);

    OperationDetail toOperationDetail (OperationDetailDto operationDetailDto);
    OperationDetailDto toOperationDetailDto (OperationDetail operationDetail);

    List<OperationDetail> toOperationDetailList (List<OperationDetailDto> operationDetailDtoList);
    List<OperationDetailDto> toOperationDetailDtoList (List<OperationDetail> operationDetailList);

}
