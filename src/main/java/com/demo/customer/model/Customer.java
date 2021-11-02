package com.demo.customer.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

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
public class Customer extends BaseEntity {
	

//	@NotBlank(message = "schema.requiredfields.userName")
	@ApiModelProperty(value = "The user name of the customer.", example = "Customer User Name", required = true)
	private String userName;

//	@TextIndexed
//	@NotBlank(message = "schema.requiredfields.firstname")
	@ApiModelProperty(value = "The first name of the customer.", example = "Customer First Name", required = true)
	private String firstName;

//	@TextIndexed
//	@NotBlank(message = "schema.requiredfields.lastname")
	@ApiModelProperty(value = "The last name of the customer.", example = "Customer Last Name", required = false)
	private String lastName;

//	@ApiModelProperty(value = "The Gender of the customer.", example = "M", required = false)
	private String gender;

	@ApiModelProperty(value = "The Birth Date of the customer.", example = "2020-02-28", required = false)
	private String birthDate;
	

	@ApiModelProperty(value = "The Email Address of the customer.", example = "abc@capg.com", required = false)
	private String email;

	@OneToMany(targetEntity = Address.class, cascade = {CascadeType.ALL})
	private List<Address> addresses;

	@ApiModelProperty(value = "The Gender of the customer.", example = "", required = false)
	private long contactNumber;

//	@NotBlank(message = "schema.requiredfields.externalSystemRef")
	@ApiModelProperty(value = "The Id of the externalSystemRef.", example = "<external System Ref>", required = true)
	private String externalSystemRef;

	@ApiModelProperty(value = "A reference to the image for the customer.", example = "<identifier for the image in the document store>", required = false)
	private String imageRef;

	private String tenant;


}
