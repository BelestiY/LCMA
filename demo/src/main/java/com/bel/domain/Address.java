package com.bel.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="address_id")
	private int addressId;

	@Column(name="address_details")
	private String addressDetails;

	private String city;

	private String country;

	@Column(name="line_1_number_building")
	private String line1NumberBuilding;

	@Column(name="line_2_number_street")
	private String line2NumberStreet;

	@Column(name="line_3_area_locality")
	private String line3AreaLocality;

	@Column(name="state_province_country")
	private String stateProvinceCountry;

	@Column(name="zip_postalcode")
	private int zipPostalcode;

	//bi-directional many-to-many association to Organization
	@ManyToMany(mappedBy="addresses")
	private List<Organization> organizations;

	//bi-directional many-to-many association to People
	@ManyToMany(mappedBy="addresses")
	private List<People> peoples;

	public Address() {
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressDetails() {
		return this.addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLine1NumberBuilding() {
		return this.line1NumberBuilding;
	}

	public void setLine1NumberBuilding(String line1NumberBuilding) {
		this.line1NumberBuilding = line1NumberBuilding;
	}

	public String getLine2NumberStreet() {
		return this.line2NumberStreet;
	}

	public void setLine2NumberStreet(String line2NumberStreet) {
		this.line2NumberStreet = line2NumberStreet;
	}

	public String getLine3AreaLocality() {
		return this.line3AreaLocality;
	}

	public void setLine3AreaLocality(String line3AreaLocality) {
		this.line3AreaLocality = line3AreaLocality;
	}

	public String getStateProvinceCountry() {
		return this.stateProvinceCountry;
	}

	public void setStateProvinceCountry(String stateProvinceCountry) {
		this.stateProvinceCountry = stateProvinceCountry;
	}

	public int getZipPostalcode() {
		return this.zipPostalcode;
	}

	public void setZipPostalcode(int zipPostalcode) {
		this.zipPostalcode = zipPostalcode;
	}

	public List<Organization> getOrganizations() {
		return this.organizations;
	}

	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;
	}

	public List<People> getPeoples() {
		return this.peoples;
	}

	public void setPeoples(List<People> peoples) {
		this.peoples = peoples;
	}

}