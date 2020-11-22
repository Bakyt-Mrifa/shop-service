package kg.megacom.shopservice.controllers;

import io.swagger.annotations.Api;
import kg.megacom.shopservice.models.dto.GoodsDto;
import kg.megacom.shopservice.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v0.1/goods/")
@Api(value ="управление магазином", description = "Сервисы по управлению магазином")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping(value = "save")
    public GoodsDto saveGoods (@RequestBody GoodsDto goodsDto){
        System.out.println(goodsDto.getMaxAmount() + " - max, "+ goodsDto.getMinAmount() + " - min");
        return goodsService.saveGoods(goodsDto);
    }
}
