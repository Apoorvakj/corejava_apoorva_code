package org.tnsif.sf.c2fc.interdemo;

public class MarkerInterfaceDemo {
	public static void main(String[] args) {
		Student s=new Student(102,"neha",12000.3,"java");
		Student s1=new Student(103,"ramu",13000,"java");
		Object obj=new Object();
		if(obj instanceof Registerable)
		{
			System.out.println("Student is registered for this course");
		}
		else
		{
			System.out.println("Student is not registered for this course");
		}
	}

}
