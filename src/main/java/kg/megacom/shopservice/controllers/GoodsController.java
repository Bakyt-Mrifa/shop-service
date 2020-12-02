package kg.megacom.shopservice.controllers;

import io.swagger.annotations.Api;
import kg.megacom.shopservice.models.dto.GoodsDto;
import kg.megacom.shopservice.models.responses.Response;
import kg.megacom.shopservice.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v0.1/goods/")
@Api(value ="управление магазином", description = "Сервисы по управлению магазином")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping(value = "save")
    public Response saveGoods (@RequestBody GoodsDto goodsDto){
        System.out.println("SAVE - " + goodsDto.getMaxAmount() + " - max, "+ goodsDto.getMinAmount() + " - min");
        return goodsService.saveGoods(goodsDto);
    }

    @PutMapping(value = "update")
    public Response updateGoods (@RequestBody GoodsDto goodsDto){
        System.out.println("UPDATE - "+goodsDto.getMaxAmount() + " - max, "+ goodsDto.getMinAmount() + " - min");
        return goodsService.updateGoods(goodsDto);
    }

    @DeleteMapping(value = "delete")
    public Response deleteGoods (@RequestBody GoodsDto goodsDto){
        System.out.println("DELETE - "+goodsDto.getMaxAmount() + " - max, "+ goodsDto.getMinAmount() + " - min");
        return goodsService.deleteGoods(goodsDto);
    }

    @GetMapping (value = "get")
    public Response getGoods (@RequestParam boolean active){
        return goodsService.getGoodsDto(active);
    }
}
