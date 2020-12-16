package kg.megacom.shopservice.services.impl;

import kg.megacom.shopservice.database.CategoryRepo;
import kg.megacom.shopservice.mappers.CategoryMapper;
import kg.megacom.shopservice.models.dto.CategoryDto;
import kg.megacom.shopservice.models.entity.Category;
import kg.megacom.shopservice.models.responses.Responses;
import kg.megacom.shopservice.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServicesImpl implements CategoryServices {

    Responses responses;
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Responses saveCategory(CategoryDto categoryDto) {
        Category category = categoryRepo.save(CategoryMapper.INSTANCE.toCategory(categoryDto));
        if (category.getName()==null){

        }
        responses=Responses.save();
        responses.setObject(CategoryMapper.INSTANCE.toCategoryDto(category));
        return responses;
    }

    @Override
    public Responses updateCategory(CategoryDto categoryDto) {

        Category category = categoryRepo.findById(categoryDto.getId()).orElse(null);

        if (category==null){
            responses=Responses.exist();
            return responses;
        }
        categoryRepo.save(category);
        responses=Responses.update();
        responses.setObject(CategoryMapper.INSTANCE.toCategoryDto(category));
        return responses;
    }

    @Override
    public Responses deleteCtegory(CategoryDto categoryDto) {
        Category category = categoryRepo.findById(categoryDto.getId()).orElse(null);
        return null;
    }

    @Override
    public Responses getCtegoryList() {
        return null;
    }
}
