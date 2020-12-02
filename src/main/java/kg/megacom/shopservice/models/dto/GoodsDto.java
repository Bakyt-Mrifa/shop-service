package kg.megacom.shopservice.models.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GoodsDto {

    private Long id;
    private String name;
    private LocalDateTime addDate;
    private LocalDateTime expirationDate;
    private int minAmount;
    private int maxAmount;
    private String qrCode;
    private CategoryDto category;
    private ProviderDto provider;
    private boolean active=true;
}
