package org.tnsif.sf.c2fc.keywords;

class Person1
{
	
}
class Employee extends Person1
{
	
}
class Manager extends Employee

{
	
}

public class InstanceOfDemo1 {

	public static void main(String[] args) {
		Person1 person =new Person1();
		Employee emp=new Employee();
		Manager manager=new Manager();
		System.out.println(emp instanceof Employee); //true
		System.out.println(emp instanceof Person1); //true
		System.out.println(emp instanceof Manager); //false
		System.out.println(manager instanceof Manager);//true
		System.out.println(manager instanceof Employee);//true
		System.out.println(manager instanceof Person1);//true
		System.out.println(person instanceof Employee);//false
		System.out.println(person instanceof Manager);//false
		

	}

}



