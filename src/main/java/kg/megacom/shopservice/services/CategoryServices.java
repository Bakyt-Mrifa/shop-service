package kg.megacom.shopservice.services;


import kg.megacom.shopservice.models.dto.CategoryDto;
import kg.megacom.shopservice.models.responses.Responses;

public interface CategoryServices {

    Responses saveCategory (CategoryDto categoryDto);
    Responses updateCategory (CategoryDto categoryDto);
    Responses deleteCtegory (CategoryDto categoryDto);
    Responses getCtegoryList ();
}
