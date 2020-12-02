package kg.megacom.shopservice.services.impl;

import kg.megacom.shopservice.database.GoodsRepo;
import kg.megacom.shopservice.mappers.GoodsMapper;
import kg.megacom.shopservice.models.dto.GoodsDto;
import kg.megacom.shopservice.models.entity.Goods;
import kg.megacom.shopservice.models.responses.Responses;
import kg.megacom.shopservice.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    private Responses responses;

    @Autowired
    private GoodsRepo goodsRepo;

    //Метод для сохранения товара
    @Override
    public Responses saveGoods(GoodsDto goodsDto) {

        System.out.println(goodsDto+" - test impl save method before saving");
        Goods goods = goodsRepo.save(GoodsMapper.INSTANCE.toGoods(goodsDto));
        Responses responses = Responses.success();
        System.out.println(goods+" test impl save method after saving");
        responses.setObject(GoodsMapper.INSTANCE.toGoodsDto(goods));
        return responses;
    }

    @Override
    public Responses updateGoods(GoodsDto goodsDto) {
        Goods goods=goodsRepo.findById(goodsDto.getId()).orElse(null);

        if (goods==null){
            responses = Responses.exist();
            return responses;
        }
        goods=GoodsMapper.INSTANCE.toGoods(goodsDto);
        goodsRepo.save(goods);
        responses = Responses.success();
        responses.setObject(GoodsMapper.INSTANCE.toGoodsDto(goods));
        return responses;
    }

    @Override
    public Responses deleteGoods(GoodsDto goodsDto) {
        Goods goods=goodsRepo.findById(goodsDto.getId()).orElse(null);

        if (goods==null){
            responses = Responses.exist();
            return responses;
        }
        goods.setActive(false);
        goodsRepo.save(goods);
        responses = Responses.delete();
        responses.setObject(GoodsMapper.INSTANCE.toGoodsDto(goods));
        return responses;
    }

    @Override
    public Responses getGoodsDto(boolean active) {
        List<Goods> goodsList = goodsRepo.findAllByActive(active);
        if (goodsList==null){
            responses = Responses.empty();
            return responses;
        }
        Responses responses = Responses.success();
        responses.setObject(GoodsMapper.INSTANCE.toGoodsDtoList(goodsList));
        return responses;
    }
}
