package kg.megacom.shopservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "cost")
public class Cost {

    @Id
    @GeneratedValue
    @Column(name = "cost_id")
    private Long id;
    private double price;
    private Date startDate;
    private Date endDate;
}
