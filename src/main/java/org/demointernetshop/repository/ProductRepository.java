package org.demointernetshop.repository;

import org.demointernetshop.entity.PaymentMethod;
import org.demointernetshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
