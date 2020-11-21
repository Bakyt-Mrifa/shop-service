package kg.megacom.shopservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "providers")
public class Provider {

    @Id
    @GeneratedValue
    @Column(name = "provider_id")
    private Long id;
    private String name;
    private String address;
    private String description;
}
