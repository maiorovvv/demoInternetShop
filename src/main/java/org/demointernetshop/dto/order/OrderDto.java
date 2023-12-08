package org.demointernetshop.dto.order;

import io.swagger.v3.oas.annotations.media.Schema;
import org.demointernetshop.dto.product.ProductShortInfoDto;

import java.time.LocalDateTime;
import java.util.List;

@Schema(name = "Order", description = "Order data")
public class OrderDto {
    @Schema(description = "Product identifier", example = "1")
    private Integer id;
    @Schema(description = "User identifier", example = "1")
    private Integer userId;
    @Schema(description = "Products")
    private List<ProductShortInfoDto> products;
    @Schema(description = "Status of order", example = "delivered")
    private String orderStatus;
    @Schema(description = "Status of payment", example = "paid")
    private String payment_status;
    @Schema(description = "Status of payment method", example = "paypal")
    private String paymentMethod;
    @Schema(description = "The date and time when the object was created", example = "2023-12-01T15:30:45")
    private LocalDateTime createData;
}
