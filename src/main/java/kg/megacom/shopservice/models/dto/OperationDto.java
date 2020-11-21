package kg.megacom.shopservice.models.dto;


import lombok.Data;

import java.util.Date;

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
}
