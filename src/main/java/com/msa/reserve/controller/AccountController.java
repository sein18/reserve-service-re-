package com.msa.reserve.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.msa.reserve.dto.AccountDto;
import com.msa.reserve.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("account")
@Slf4j
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public String creatAccount(@RequestBody @Valid final AccountDto.AccountReq dto) {
		log.info("reserve-service createAccount call");
		accountService.create(dto);
		return "true";
	}
}
