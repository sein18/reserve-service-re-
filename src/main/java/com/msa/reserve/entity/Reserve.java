package com.msa.reserve.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reserve")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reserve {
	
	@Id
	@Column(name = "reserve_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@OneToOne
	@ManyToOne(targetEntity=Product.class, fetch=FetchType.EAGER)
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	private Product product;
	
//	@OneToOne//(cascade = CascadeType.ALL)
	@ManyToOne(targetEntity=Account.class, fetch=FetchType.EAGER)
	@JoinColumn(name = "account_id", referencedColumnName = "account_id")
	private Account account;
	
    @Temporal(TemporalType.TIMESTAMP)
    private Date reserveFrom;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reserveTo;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    
    @Builder
    public Reserve(Product product, Account account, Date reserveFrom, Date reserveTo) {
    	this.product = product;
    	this.account = account;
    	this.reserveFrom = reserveFrom;
    	this.reserveTo = reserveTo;	
    }

}
