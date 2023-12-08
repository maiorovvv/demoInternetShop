package org.demointernetshop.repository;

import org.demointernetshop.entity.Product;
import org.demointernetshop.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {
}
