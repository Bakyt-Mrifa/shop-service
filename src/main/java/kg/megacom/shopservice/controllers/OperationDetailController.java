package kg.megacom.shopservice.controllers;

import io.swagger.annotations.Api;
import kg.megacom.shopservice.models.dto.OperationDetailDto;
import kg.megacom.shopservice.models.responses.Responses;
import kg.megacom.shopservice.services.OperationDetailService;
import kg.megacom.shopservice.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v0.1/operDet/")
@Api(value ="управление магазином", description = "Сервисы по управлению магазином")
public class OperationDetailController {
    @Autowired
        private OperationDetailService operationDetailService;

        @Autowired
        private OperationService operationService;

    /*    @PostMapping(value = "save")
        public Responses saveOperDetail (@RequestBody OperationDetailDto operationDetailDto){
            Responses responses=operationDetailService.save(operationDetailDto);
            operationDetailDto = operationService.operation((OperationDetailDto)responses.getObject());

            return operationService.operation(operationDetailDto);
    }
*/

}
