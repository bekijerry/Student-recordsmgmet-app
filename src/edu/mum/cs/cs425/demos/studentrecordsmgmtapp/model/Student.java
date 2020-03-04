package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
	String studentId;
	String name;
	LocalDate dateOfAdmission;

	public Student() {
	}

	public Student(String studentId, String name, LocalDate dateOfAdmission) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = dateOfAdmission;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public String toString() {
		return "s1:studentId=" + studentId + ", name=" + name + ", dateOfAdmission="
				+ dateOfAdmission.format(DateTimeFormatter.ofPattern("MM/dd/YYYY"));
	}

}
