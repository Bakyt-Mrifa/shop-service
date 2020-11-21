package kg.megacom.shopservice.models.dto;

import lombok.Data;

@Data
public class ProviderDto {

    private Long id;
    private String name;
    private String address;
    private String description;
}
