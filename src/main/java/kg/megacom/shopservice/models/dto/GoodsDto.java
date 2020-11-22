package kg.megacom.shopservice.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class GoodsDto {

    private Long id;
    private String name;
    private Date addDate;
    private Date expirationDate;
    private int minAmount;
    private int maxAmount;
    private String qrCode;
    private CategoryDto category;
    private ProviderDto provider;
}
