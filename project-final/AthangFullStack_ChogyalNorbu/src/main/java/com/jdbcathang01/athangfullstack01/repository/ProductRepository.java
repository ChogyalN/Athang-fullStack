package com.jdbcathang01.athangfullstack01.repository;

import com.jdbcathang01.athangfullstack01.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
