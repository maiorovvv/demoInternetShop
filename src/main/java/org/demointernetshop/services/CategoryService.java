package org.demointernetshop.services;

import lombok.RequiredArgsConstructor;
import org.demointernetshop.dto.product.CategoryDto;
import org.demointernetshop.dto.product.CategoryWithPricesDto;
import org.demointernetshop.entity.Category;
import org.demointernetshop.repository.CategoryRepository;
import org.demointernetshop.services.utils.Converters;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final Converters converters;

    public List<CategoryDto> getAllCategory(){
        return categoryRepository.findAll().stream()
                .map(converters::formCategoryToDto)
                .toList();
    }

    public CategoryWithPricesDto getCategoryWithPrices(Integer categoryId) {
        Optional<Category> categoryByIdOptional = categoryRepository.findById(categoryId);
        if (categoryByIdOptional.isPresent()) {
            Integer minPrice =
         }
    }
}
