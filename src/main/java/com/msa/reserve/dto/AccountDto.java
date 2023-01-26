package com.msa.reserve.dto;

import javax.validation.Valid;

import com.msa.reserve.entity.Account;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class AccountDto {
	
	@Getter
	@NoArgsConstructor(access = AccessLevel.PROTECTED)
	public static class AccountReq {
		
		@Valid
		private long id;
		
		@Valid
		private String email;
		
		@Builder
		public AccountReq(long id, String email) {
			this.id = id;
			this.email = email;
		}
		
		public Account toEntity() {
			return Account.builder()
					.id(this.id)
					.email(this.email)
					.build();
		}
	}
	
}
