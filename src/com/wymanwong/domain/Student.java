package com.wymanwong.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")
public class Student extends BaseEntity {

	private static final long serialVersionUID = 3363274286833042195L;

	@Column(name = "student_no")
	@Size(max = 20)
	private String studentNo;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "name_id")
	private Name name;

	@Column(name = "moblie")
	@Size(max = 20)
	private String moblie;

	@Column(name = "address")
	@Size(max = 20)
	private String address;

	public String getStudentNo() {
		return studentNo;
	}

	public Name getName() {
		return name;
	}

	public String getMoblie() {
		return moblie;
	}

	public String getAddress() {
		return address;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
