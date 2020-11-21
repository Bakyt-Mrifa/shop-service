package kg.megacom.shopservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "debt_books")
public class DebtBook {

    @Id
    @GeneratedValue
    @Column(name = "debt_book_id")
    private Long id;
    private double sum;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
}
