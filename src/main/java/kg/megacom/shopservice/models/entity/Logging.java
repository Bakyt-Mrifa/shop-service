package kg.megacom.shopservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "logs")
public class Logging {

    @Id
    @GeneratedValue
    @Column(name = "log_id")
    private Long id;
    private String description;
}
