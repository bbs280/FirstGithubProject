package com.wymanwong.domain;

public class Person extends BaseEntity {

	private static final long serialVersionUID = -5970878346132541638L;

	private int age;
	private PersonName personName;

	public int getAge() {
		return age;
	}

	public PersonName getPersonName() {
		return personName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPersonName(PersonName personName) {
		this.personName = personName;
	}

}
