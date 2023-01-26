package com.msa.reserve.dto;

import javax.validation.Valid;

import com.msa.reserve.entity.Product;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ProductDto {
	
	@Getter
	@NoArgsConstructor(access = AccessLevel.PROTECTED)
	public static class ProductReq {
		
		@Valid
		private long id;
		
		@Valid
		private String productName;
		
		@Valid
		private long price;
		
		@Builder
		public ProductReq(long id, String productName, long price) {
			this.id = id;
			this.productName = productName;
			this.price = price;
		}
		
		public Product toEntity() {
			return Product.builder()
					.id(this.id)
					.productName(this.productName)
					.price(this.price)
					.build();
		}
	}
	
}
