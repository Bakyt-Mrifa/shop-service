package kg.megacom.shopservice.models.dto;

import lombok.Data;

@Data
public class OperationDetailDto {
    private Long id;
    private GoodsDto goods;
    private CostDto cost;
    private double totalCost;
    private int amount;
//    private OperationDto operation;
}
