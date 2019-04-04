package com.spring.ssm.entity;

public class StudentTeacherBean {
	private Student student;
	private Teacher teacher;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Bean [student=" + student + ", teacher=" + teacher + "]";
	}

}
