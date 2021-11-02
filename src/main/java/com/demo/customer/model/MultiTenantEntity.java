package com.demo.customer.model;

import javax.persistence.MappedSuperclass;

/**
 * @author capgemini
 */

@MappedSuperclass
public interface MultiTenantEntity extends Entity {
	
	public String getTenant();
	
	public void setTenant(String tenant);
	
}
