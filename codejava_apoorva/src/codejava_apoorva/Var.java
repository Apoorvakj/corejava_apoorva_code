package codejava_apoorva;

public class Var {

		int a = 10;
		void print() {
			String msg= "hello";//local variable
			System.out.println(msg);
		}
	static String message="hello students";//static variable
	public static void main(String[] args) {
		Var obj=new  Var();
		System.out.println("the value of a"+obj.a);
		obj.print();
		System.out.println(message);
		
	}

}
