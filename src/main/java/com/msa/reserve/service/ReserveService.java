package com.msa.reserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msa.reserve.dto.ReserveDto;
import com.msa.reserve.entity.Reserve;
import com.msa.reserve.repository.ReserveRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class ReserveService {
	
	@Autowired
	private ReserveRepository reserveRepository;
	
	@Transactional(readOnly = true)
	public List<Reserve> findAllReserve() {
	    return reserveRepository.findAll();
	}

	public void create(ReserveDto.ReserveReq dto) {
		reserveRepository.save(dto.toEntity());
	}
	
	public List<Reserve> findReserveByAccount(long accountId) {
		return reserveRepository.findByAccountId(accountId);
	}

}
