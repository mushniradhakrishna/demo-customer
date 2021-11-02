package com.demo.customer.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author capgemini
 */
@Getter
@Setter
@Entity
@Table(name = CustomerDocument.COLLECTION_NAME)
public class CustomerDocument extends Customer implements MultiTenantEntity {

	public static final String COLLECTION_NAME = "customers";
	
	private String tenant;
	
	
	
}
