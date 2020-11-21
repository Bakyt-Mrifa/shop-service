package kg.megacom.shopservice.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CostDto {

    private Long id;
    private double price;
    private Date startDate;
    private Date endDate;
}
