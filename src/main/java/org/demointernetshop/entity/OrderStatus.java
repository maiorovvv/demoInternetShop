package org.demointernetshop.entity;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

import java.util.List;

@Entity
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String status;
    @OneToMany(mappedBy = "orderStatus")
    private List<Order> orders;

}
