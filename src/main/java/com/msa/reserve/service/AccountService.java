package com.msa.reserve.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msa.reserve.dto.AccountDto;
import com.msa.reserve.repository.AccountRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	public void create(AccountDto.AccountReq dto) {
		accountRepository.save(dto.toEntity());
	}
}
