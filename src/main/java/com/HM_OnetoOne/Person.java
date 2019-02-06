package com.HM_OnetoOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	int personId;
	String personName;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	//@JoinColumn(name="pD_FK")
	@PrimaryKeyJoinColumn
	PersonDetails personDetails;
	
	public PersonDetails getPersonDetails() {
		return personDetails;
	}
	public void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	

}
