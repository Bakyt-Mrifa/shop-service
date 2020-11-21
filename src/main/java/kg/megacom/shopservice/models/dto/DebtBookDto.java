package kg.megacom.shopservice.models.dto;

import lombok.Data;

@Data
public class DebtBookDto {

    private Long id;
    private double sum;
    private UserDto user;
}
