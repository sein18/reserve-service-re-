package com.msa.reserve.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msa.reserve.entity.Reserve;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {
	
	List<Reserve> findByAccountId(long accountId);

}
