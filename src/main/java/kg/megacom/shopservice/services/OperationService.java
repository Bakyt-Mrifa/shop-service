package kg.megacom.shopservice.services;

import kg.megacom.shopservice.models.dto.OperationDetailDto;
import kg.megacom.shopservice.models.responses.Responses;

import java.util.List;

public interface OperationService {

   Responses createOperation (List<OperationDetailDto> operationDetailDtoList);

}
