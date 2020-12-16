package kg.megacom.shopservice.mappers;

import kg.megacom.shopservice.models.dto.OperationDetailDto;
import kg.megacom.shopservice.models.dto.OperationDto;
import kg.megacom.shopservice.models.entity.Operation;
import kg.megacom.shopservice.models.entity.OperationDetail;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OperationMapper {

    OperationMapper INSTANCE= Mappers.getMapper(OperationMapper.class);

    Operation toOperation(OperationDto operationDto);
    OperationDto toOperationDto(OperationDetailDto operationDetailDto);

}
