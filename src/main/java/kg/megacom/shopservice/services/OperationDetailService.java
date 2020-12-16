package kg.megacom.shopservice.services;

import kg.megacom.shopservice.models.dto.OperationDetailDto;
import kg.megacom.shopservice.models.responses.Responses;

import java.util.List;

public interface OperationDetailService {

    Responses save(OperationDetailDto operationDetailDto);
    List<OperationDetailDto> operationDetailList(OperationDetailDto operationDetailDto);

}
