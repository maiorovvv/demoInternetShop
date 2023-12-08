package org.demointernetshop.dto.cart;

import io.swagger.v3.oas.annotations.media.Schema;
import org.demointernetshop.dto.product.ProductShortInfoDto;

import java.util.List;

@Schema(name = "Cart", description = "Cart data")
public class CartDto {
    @Schema(description = "Cart identifier", example = "1")
    private Integer id;
    @Schema(description = "User identifier", example = "14")
    private Integer userId;
    @Schema(description = "Products")
    private List<ProductShortInfoDto> products;
}
