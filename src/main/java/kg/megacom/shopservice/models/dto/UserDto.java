package kg.megacom.shopservice.models.dto;

import kg.megacom.shopservice.models.enums.Role;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String phone;
    private String address;
    private AccountDto account;
    private Role role;
}
