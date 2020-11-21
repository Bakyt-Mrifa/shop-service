package kg.megacom.shopservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "operation_type")
public class OperationType {

    @Id
    @GeneratedValue
    @Column(name = "operation_type_id")
    private Long id;
    private String name;
}
