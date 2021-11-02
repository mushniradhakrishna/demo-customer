package com.demo.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.geo.Point;

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
@Entity
@Table(name="Addresses")
public class Address {
	

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@ApiModelProperty(hidden = true)
	private String id;

//	@NotBlank(message = "schema.requiredfields.latitude")
	@ApiModelProperty(value = " Store latitude.", required = true)
	private double latitude;

//	@NotBlank(message = "schema.requiredfields.longitude")
	@ApiModelProperty(value = " Store longitude.", required = true)
	private double longitude;

//	@TextIndexed
//	@NotBlank(message = "schema.requiredfields.addressline1")
	@ApiModelProperty(value = "Address line 1.", required = true)
	private String address1;

//	@TextIndexed
	@ApiModelProperty(value = "Address line 2.", required = false)
	private String address2;

//	@TextIndexed
	@ApiModelProperty(value = "Nearby landmark.", required = false)
	private String landmark;

//	@NotBlank(message = "schema.requiredfields.city")
	@ApiModelProperty(value = "City name.", required = false)
	private String city;

//	@NotBlank(message = "schema.requiredfields.state")
	@ApiModelProperty(value = " State name.", required = false)
	private String state;

//	@NotBlank(message = "schema.requiredfields.country")
	@ApiModelProperty(value = "Country name.", required = false)
	private String country;

//	@NotBlank(message = "schema.requiredfields.postalcode")
	@ApiModelProperty(value = "Zip / Postal code.", required = false)
	private String postalCode;

	@ApiModelProperty(value = "GPS co-ordinates for the address.", hidden = true)
	private Point location;
	
}
