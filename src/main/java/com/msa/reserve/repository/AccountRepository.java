package com.msa.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msa.reserve.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
