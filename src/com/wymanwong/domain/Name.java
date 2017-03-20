package com.wymanwong.domain;

public class Name extends BaseEntity {

	private static final long serialVersionUID = -8262773743815332820L;

	private String nameCn;
	private String nameEn;
	private Person person;

	public Name() {
	}

	public Name(String nameCn, String nameEn) {
		this.nameCn = nameCn;
		this.nameEn = nameEn;
	}

	public String getNameCn() {
		return nameCn;
	}

	public String getNameEn() {
		return nameEn;
	}

	public Person getPerson() {
		return person;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
