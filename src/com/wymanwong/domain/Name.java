package com.wymanwong.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "name")
public class Name extends BaseEntity {

	private static final long serialVersionUID = -8262773743815332820L;

	@Column(name = "name_cn")
	private String nameCn;

	@Column(name = "name_en")
	private String nameEn;
	
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

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

}
