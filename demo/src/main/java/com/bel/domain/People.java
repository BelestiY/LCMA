package com.bel.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the people database table.
 * 
 */
@Entity
@NamedQuery(name="People.findAll", query="SELECT p FROM People p")
public class People implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="person_id")
	private int personId;

	@Temporal(TemporalType.DATE)
	@Column(name="`date_of-birth`")
	private Date dateOf_birth;

	@Column(name="first_name")
	private String firstName;

	private String gender;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="organization_id_peop")
	private int organizationIdPeop;

	@Column(name="person_details")
	private String personDetails;

	//bi-directional many-to-many association to Address
	@ManyToMany
	@JoinTable(
		name="people_address"
		, joinColumns={
			@JoinColumn(name="person_id_pa")
			}
		, inverseJoinColumns={
			@JoinColumn(name="address_id_pa")
			}
		)
	private List<Address> addresses;

	public People() {
	}

	public int getPersonId() {
		return this.personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public Date getDateOf_birth() {
		return this.dateOf_birth;
	}

	public void setDateOf_birth(Date dateOf_birth) {
		this.dateOf_birth = dateOf_birth;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getOrganizationIdPeop() {
		return this.organizationIdPeop;
	}

	public void setOrganizationIdPeop(int organizationIdPeop) {
		this.organizationIdPeop = organizationIdPeop;
	}

	public String getPersonDetails() {
		return this.personDetails;
	}

	public void setPersonDetails(String personDetails) {
		this.personDetails = personDetails;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}