package com.msa.reserve.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {

    @Id
    @Column(name = "account_id")
    private Long id;
    
    @Email
    @Column(name = "email", nullable = false)
    private String email;
    
//    @OneToOne(mappedBy = "account")
//    private Reserve reserve;

    @Builder
    public Account(long id, String email) {
    	this.id = id;
    	this.email = email;
    }

}
