package kg.megacom.shopservice.models.entity;

import kg.megacom.shopservice.models.enums.Role;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    private String name;
    private String phone;
    private String address;
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    private Account account;
    @Enumerated(value = EnumType.STRING)
    private Role role;
}
