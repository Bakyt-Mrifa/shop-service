package kg.megacom.shopservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "operation_detail")
public class OperationDetail {

    @Id
    @GeneratedValue
    @Column(name = "Operation_detail_id")
    private Long id;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "goods_id")
    private Goods goods;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "cost_id")
    private Cost cost;
    private int amount;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "operation_id")
    private Operation operation;
}
