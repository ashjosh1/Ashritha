package org.cap.demo;

public class MainCalss {

	public static void main(String[] args) {
		SalesClass class1=new SalesClass();
		RepresentClass class2=new RepresentClass();
		System.out.println("HEllo");
		greet();
		class1.show();
		class2.SayHello();
		

	}
	public static void greet() {
		System.out.println("world");
		System.out.println("hi");
		System.out.println("hey");
	}

}
