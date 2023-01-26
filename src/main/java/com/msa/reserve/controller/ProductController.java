package com.msa.reserve.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.msa.reserve.dto.ProductDto;
import com.msa.reserve.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("product")
@Slf4j
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public String creatProduct(@RequestBody @Valid final ProductDto.ProductReq dto) {
		log.info("reserve-service creatProduct call");
		productService.create(dto);
		return "true";
	}
}
