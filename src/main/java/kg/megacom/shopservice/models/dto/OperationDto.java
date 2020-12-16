package kg.megacom.shopservice.models.dto;


import kg.megacom.shopservice.models.entity.OperationDetail;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OperationDto {
    private Long id;
    private UserDto user;
    private Long customerId;   // Номер номер чека
    private double totalCost;  // Общая стоимость
    private double actualCost; // Фактическая оплата
    private double difference; // Сдача
    private Date operationDate;
    private OperationTypeDto operationType;
    private List<OperationDetail> operationDetailList;
}
