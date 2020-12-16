package kg.megacom.shopservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goods_id")
    private Long id;
    private String name;
    private LocalDateTime addDate;
    private LocalDateTime expirationDate;
    private int minAmount;
    private int maxAmount;
    private String qrCode;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;
    private boolean active=true;

}
