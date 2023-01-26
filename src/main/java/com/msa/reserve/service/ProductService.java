package com.msa.reserve.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msa.reserve.dto.ProductDto;
import com.msa.reserve.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public void create(ProductDto.ProductReq dto) {
		productRepository.save(dto.toEntity());
	}
}
