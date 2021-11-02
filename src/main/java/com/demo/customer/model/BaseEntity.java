package com.demo.customer.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author capgemini
 */
@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class BaseEntity implements Entity{


	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@ApiModelProperty(hidden = false)
	private String id;

	@ApiModelProperty(position = 10000, value="When creating the user ID of the creator, not required otherwise", example = "createuser")
	private String createdBy;

	@ApiModelProperty(hidden = true)
	private Date createdDate;

	@ApiModelProperty(position = 10002, value="When updating the user ID of the updater, not required otherwise", example = "modifyuser")
	private String modifiedBy;

	@ApiModelProperty(hidden = true)
	private Date modifiedDate;

}
