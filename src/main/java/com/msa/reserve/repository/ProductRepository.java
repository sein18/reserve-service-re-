package com.msa.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msa.reserve.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
