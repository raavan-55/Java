package com.cf.HibernateDemo;




import javax.persistence.*;

@Entity
public class Studentaa {
	
	@Id
	int rollno;
	String name;
	int marks1;
	int marks2;
	int avg;
	
	public Studentaa() {
		
	}

	public Studentaa(int rollno, String name, int marks1, int marks2, int avg) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.avg = avg;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", avg="
				+ avg + "]";
	}
	

}
