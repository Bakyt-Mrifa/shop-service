package kg.megacom.shopservice.mappers;

import kg.megacom.shopservice.models.dto.CategoryDto;
import kg.megacom.shopservice.models.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE= Mappers.getMapper(CategoryMapper.class);

    Category toCategory (CategoryDto categoryDto);
    CategoryDto toCategoryDto (Category category);
}
