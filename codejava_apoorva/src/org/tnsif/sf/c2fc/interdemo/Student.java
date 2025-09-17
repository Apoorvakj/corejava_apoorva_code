package org.tnsif.sf.c2fc.interdemo;

public class Student implements Registerable{
	private int id;
	private String name;
	private double fees;
	private String course;
	
	public Student(int id, String name, double fees, String course) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.course = course;
	}
	public Student(int id2, String name2, int fees2, String course2) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	

}