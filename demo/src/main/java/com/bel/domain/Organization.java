package com.bel.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the organization database table.
 * 
 */
@Entity
@NamedQuery(name="Organization.findAll", query="SELECT o FROM Organization o")
public class Organization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="organization_id")
	private int organizationId;

	@Column(name="organization_details")
	private String organizationDetails;

	@Column(name="organization_name")
	private String organizationName;

	@Column(name="organization_type_code")
	private int organizationTypeCode;

	//bi-directional many-to-many association to Address
	@ManyToMany
	@JoinTable(
		name="organization_address"
		, joinColumns={
			@JoinColumn(name="organization_id_oa")
			}
		, inverseJoinColumns={
			@JoinColumn(name="address_id_oa")
			}
		)
	private List<Address> addresses;

	public Organization() {
	}

	public int getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationDetails() {
		return this.organizationDetails;
	}

	public void setOrganizationDetails(String organizationDetails) {
		this.organizationDetails = organizationDetails;
	}

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public int getOrganizationTypeCode() {
		return this.organizationTypeCode;
	}

	public void setOrganizationTypeCode(int organizationTypeCode) {
		this.organizationTypeCode = organizationTypeCode;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}