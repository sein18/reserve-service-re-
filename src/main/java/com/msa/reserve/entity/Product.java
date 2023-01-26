package com.msa.reserve.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

	@Id
	@Column(name = "product_id")
	private Long id;
	
	@Column(nullable = false)
	private String productName;
	
	@Column(nullable = false)
	private Long price;
	
	
	@Builder
	public Product(long id, String productName, long price) {
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
	
}

