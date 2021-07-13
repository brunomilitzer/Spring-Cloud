package com.brunomilitzer.springcloud.repository;

import com.brunomilitzer.springcloud.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
