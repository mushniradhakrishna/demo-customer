package com.demo.customer.model;

import java.util.Date;


public interface Entity {
	
	public String getId();
	
	public void setId(String id);

	public String getCreatedBy();
	
	public void setCreatedBy(String createdBy);
	
	public Date getCreatedDate();
	
	public void setCreatedDate(Date createdDate);
	
	public String getModifiedBy();
	
	public void setModifiedBy(String modifiedBy);
	
	public Date getModifiedDate();
	
	public void setModifiedDate(Date modifiedDate);
	
}
