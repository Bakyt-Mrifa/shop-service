package kg.megacom.shopservice.mappers;

import kg.megacom.shopservice.models.dto.GoodsDto;
import kg.megacom.shopservice.models.entity.Goods;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GoodsMapper {

    GoodsMapper INSTANCE = Mappers.getMapper(GoodsMapper.class);

@Mapping(target = "addDate", source = "goodsDto.addDate")
    Goods toGoods (GoodsDto goodsDto);
    GoodsDto toGoodsDto (Goods goods);
}
