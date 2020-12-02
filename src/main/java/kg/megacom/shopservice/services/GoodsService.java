package kg.megacom.shopservice.services;

import kg.megacom.shopservice.models.dto.GoodsDto;
import kg.megacom.shopservice.models.responses.Responses;

public interface GoodsService {

    Responses saveGoods (GoodsDto goodsDto);
    Responses updateGoods (GoodsDto goodsDto);
    Responses deleteGoods (GoodsDto goodsDto);
    Responses getGoodsDto (boolean active);
}
