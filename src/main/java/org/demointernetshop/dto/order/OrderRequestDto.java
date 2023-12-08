package org.demointernetshop.dto.order;

import io.swagger.v3.oas.annotations.media.Schema;
import org.demointernetshop.dto.product.ProductShortInfoDto;

import java.util.List;

@Schema(name = "OrderRequest", description = "Order Request data")
public class OrderRequestDto {
    @Schema(description = "Cart identifier", example = "14")
    private Integer cartId;
    @Schema(description = "User identifier", example = "14")
    private Integer userId;
    @Schema(description = "Products")
    private List<ProductShortInfoDto> products;
}
