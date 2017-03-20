package com.wymanwong.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Person extends BaseEntity {

	private static final long serialVersionUID = -5970878346132541638L;

	// private String name;
	private Name name;
	private Integer age;
	private List<String> schoolLists = new ArrayList<String>();
	private SortedSet<String> schoolSets = new TreeSet<String>();
	private Collection<String> schoolCollections = new ArrayList<String>();
	private Map<String, Float> scores = new HashMap<String, Float>();

	public Name getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public List<String> getSchoolLists() {
		return schoolLists;
	}

	public SortedSet<String> getSchoolSets() {
		return schoolSets;
	}

	public Collection<String> getSchoolCollections() {
		return schoolCollections;
	}

	public Map<String, Float> getScores() {
		return scores;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setSchoolLists(List<String> schoolLists) {
		this.schoolLists = schoolLists;
	}

	public void setSchoolSets(SortedSet<String> schoolSets) {
		this.schoolSets = schoolSets;
	}

	public void setSchoolCollections(Collection<String> schoolCollections) {
		this.schoolCollections = schoolCollections;
	}

	public void setScores(Map<String, Float> scores) {
		this.scores = scores;
	}

}
