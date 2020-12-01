package com.hibernate.tut;

import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class Student {
    @Id
    private int id;
    private String sName;
    private String course;
	@Override
	public String toString() {
		return "Student [id=" + id + ", sName=" + sName + ", course=" + course + "]";
	}
	public Student(int id, String sName, String course) {
		super();
		this.id = id;
		this.sName = sName;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

    
}
