package kg.megacom.shopservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue
    @Column(name = "goods_id")
    private Long id;
    private String name;
    private Date addDate;
    private Date expirationDate;
    private int minAmount;
    private int maxAmount;
    private Object qrCode;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cotegory_id")
    private Category category;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "provider_id")
    private Provider provider;
}
