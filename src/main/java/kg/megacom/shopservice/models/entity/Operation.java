package kg.megacom.shopservice.models.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "operations")
public class Operation {

    @Id
    @GeneratedValue
    @Column(name = "operation_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Long customerId;   // Номер номер чека
    private double totalCost;  // Общая стоимость
    private double actualCost; // Фактическая оплата
    private double difference; // Сдача
    private Date operationDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "operation_type_id")
    private OperationType operationType;
}
