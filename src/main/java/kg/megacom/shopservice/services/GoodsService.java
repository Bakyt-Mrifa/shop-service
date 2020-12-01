package kg.megacom.shopservice.services;

import kg.megacom.shopservice.models.dto.GoodsDto;
import kg.megacom.shopservice.models.responses.Response;

public interface GoodsService {

    Response saveGoods (GoodsDto goodsDto);
    Response updateGoods (GoodsDto goodsDto);
    Response deleteGoods (GoodsDto goodsDto);
}
