package kg.megacom.shopservice.models.dto;


import lombok.Data;

@Data
public class AccountDto {

    private Long id;
    private String login;
    private String password;
}
