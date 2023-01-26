package com.msa.reserve.dto;

import java.util.Date;

import javax.validation.Valid;

import com.msa.reserve.entity.Account;
import com.msa.reserve.entity.Product;
import com.msa.reserve.entity.Reserve;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ReserveDto {
	
	@Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class ReserveReq {
    	
    	@Valid
        private Product product;
    	
    	@Valid
    	private Account account;
    	
    	@Valid
        private Date reserveFrom;
    	
    	@Valid
        private Date reserveTo;

        @Builder
        public ReserveReq(Product product, Account account, Date reserveFrom, Date reserveTo) {
            this.product = product;
            this.account = account;
            this.reserveFrom = reserveFrom;
            this.reserveTo = reserveTo;
        }

        public Reserve toEntity() {
            return Reserve.builder()
                    .product(this.product)
                    .account(this.account)
                    .reserveFrom(this.reserveFrom)
                    .reserveTo(this.reserveTo)
                    .build();
        }
	}
	
	@Getter
	public static class Res {
		private long reserveId;
		private Product product;
		private Account account;
		private Date reserveFrom;
		private Date reserveTo;
		
		public Res(Reserve reserve) {
			this.reserveId = reserve.getId();
			this.product = reserve.getProduct();
			this.account = reserve.getAccount();
			this.reserveFrom = reserve.getReserveFrom();
			this.reserveTo = reserve.getReserveTo();
		}
		
	}

}
