package org.tnsif.sf.c2fc.Scannerclass_BufferDemo;
import java.util.Scanner;

public class ScannerClass_Demo {
public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your name");
			String name=scan.nextLine();
			System.out.println(name);
			System.out.println("Enter your age");
			int age=scan.nextInt();
			System.out.println(age);
			scan.close();

		}

	}


