package org.demointernetshop.dto.product;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Category", description = "Category data")
public class CategoryWithPricesDto {
    @Schema(description = "Category identifier", example = "1")
    private Integer id;
    @Schema(description = "minPrice", example = "201")
    private Integer minPrice;
    @Schema(description = "maxPrice", example = "10000")
    private Integer maxPrice;
    @Schema(description = "Name of the Category", example = "smartphones")
    private String categoryName;
}
