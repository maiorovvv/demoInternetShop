package org.demointernetshop.services.utils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.demointernetshop.dto.product.CategoryDto;
import org.demointernetshop.dto.product.CategoryWithPricesDto;
import org.demointernetshop.entity.Category;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class Converters {
    public CategoryDto formCategoryToDto(Category category) {
        return new CategoryDto(category.getId(), category.getCategoryName());
    }

}
