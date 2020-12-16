package kg.megacom.shopservice.controllers;

import io.swagger.annotations.Api;
import kg.megacom.shopservice.models.dto.OperationDetailDto;
import kg.megacom.shopservice.models.responses.Responses;
import kg.megacom.shopservice.services.OperationDetailService;
import kg.megacom.shopservice.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v0.1/operation/")
@Api(value ="управление магазином", description = "Сервисы по управлению магазином")
public class OperationController {
    @Autowired
    private OperationDetailService operationDetailService;
    @Autowired
    private OperationService operationService;

    @PostMapping(value = "create")
    public Responses createOperation(@RequestBody OperationDetailDto operationDetailDto, @RequestParam double actualCost){

        List<OperationDetailDto> operationDetailDtoList = operationDetailService.operationDetailList(operationDetailDto);
        return operationService.createOperation(operationDetailDtoList);
    }
}
