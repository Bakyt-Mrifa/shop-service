package kg.megacom.shopservice.services.impl;

import kg.megacom.shopservice.database.GoodsRepo;
import kg.megacom.shopservice.mappers.GoodsMapper;
import kg.megacom.shopservice.models.dto.GoodsDto;
import kg.megacom.shopservice.models.entity.Goods;
import kg.megacom.shopservice.models.responses.Response;
import kg.megacom.shopservice.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepo goodsRepo;

    //Метод для сохранения товара
    @Override
    public Response saveGoods(GoodsDto goodsDto) {
             System.out.println(goodsDto+" - test impl save method before saving");
        Goods goods = goodsRepo.save(GoodsMapper.INSTANCE.toGoods(goodsDto));
        Response response=Response.success();
        System.out.println(goods+" test impl save method after saving");
        response.setObject(GoodsMapper.INSTANCE.toGoodsDto(goods));
        return response ;
    }

    @Override
    public Response updateGoods(GoodsDto goodsDto) {
        Goods goods=goodsRepo.findById(goodsDto.getId()).orElse(null);
        Response response ;

        if (goods==null){
            response=Response.error();
            return response;
        }
        Long tempId = goods.getId();
        goods=GoodsMapper.INSTANCE.toGoods(goodsDto);
        goods.setId(tempId);
        goodsRepo.save(goods);
        response=Response.success();
        response.setObject(GoodsMapper.INSTANCE.toGoodsDto(goods));
        return response;
    }

    @Override
    public Response deleteGoods(GoodsDto goodsDto) {
        Goods goods=goodsRepo.findById(goodsDto.getId()).orElse(null);
        Response response ;

        if (goods==null){
            response=Response.error();
            return response;
        }
        Long tempId = goods.getId();
        goods.setActive(false);
        goodsRepo.save(goods);
        response=Response.success();
        response.setObject(GoodsMapper.INSTANCE.toGoodsDto(goods));
        return response;
    }

    @Override
    public Response getGoodsDto(boolean active) {
        Response response=Response.success();
        List<Goods> goodsList = goodsRepo.findAllByActive(active);
        response.setObject(GoodsMapper.INSTANCE.toGoodsDtoList(goodsList));
        return response;
    }
}
