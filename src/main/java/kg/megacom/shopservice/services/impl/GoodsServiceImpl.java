package kg.megacom.shopservice.services.impl;

import kg.megacom.shopservice.database.GoodsRepo;
import kg.megacom.shopservice.mappers.GoodsMapper;
import kg.megacom.shopservice.models.dto.GoodsDto;
import kg.megacom.shopservice.models.entity.Goods;
import kg.megacom.shopservice.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepo goodsRepo;

    //Метод для сохранения товара
    @Override
    public GoodsDto saveGoods(GoodsDto goodsDto) {
        System.out.println(goodsDto.getAddDate()+", "+goodsDto.getMaxAmount()+" - test impl save method before saving");
        Goods goods = goodsRepo.save(GoodsMapper.INSTANCE.toGoods(goodsDto));

        System.out.println(goods.getAddDate()+", "+goods.getMaxAmount()+" - test impl save method after saving");
        return GoodsMapper.INSTANCE.toGoodsDto(goods);
    }
}
