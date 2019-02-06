package com.HM_OnetoOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonDetails {
	@Id
	@GeneratedValue
	int personDetailsId;
	String job;
	@OneToOne(mappedBy="personDetails",cascade=CascadeType.ALL)
	Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getPersonDetailsId() {
		return personDetailsId;
	}
	public void setPersonDetailsId(int personDetailsId) {
		this.personDetailsId = personDetailsId;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	

}
