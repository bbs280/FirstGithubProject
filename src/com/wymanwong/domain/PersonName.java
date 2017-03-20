package com.wymanwong.domain;

import java.util.HashMap;
import java.util.Map;

public class PersonName extends BaseEntity {

	private static final long serialVersionUID = -5988448359645445192L;

	private String first;
	private String last;
	private Person owner;
	private Map<String, Integer> power = new HashMap<String, Integer>();

	public PersonName() {

	}

	public PersonName(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public Person getOwner() {
		return owner;
	}

	public Map<String, Integer> getPower() {
		return power;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public void setPower(Map<String, Integer> power) {
		this.power = power;
	}

}
