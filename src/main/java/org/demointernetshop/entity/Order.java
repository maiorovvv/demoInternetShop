package org.demointernetshop.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Integer id;
    private User user;
    private List<OrderItem> orderItems;
    private BigDecimal totalAmount;
    private OrderStatus orderStatus;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;
    private LocalDateTime createData;

}
