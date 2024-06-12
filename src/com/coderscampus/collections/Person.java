package com.coderscampus.collections;

import java.util.Objects;

public class Person {
	private String firstName;
	private String lastName;
	private Integer ssn;
	
	public Person(int ssn, String firstName, String lastName) {
		this.ssn=ssn;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getSsn() {
		return ssn;
	}
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ssn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(ssn, other.ssn);
	}
	
	
	
}

