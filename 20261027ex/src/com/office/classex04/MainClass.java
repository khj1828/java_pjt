package com.office.classex04;

public class MainClass {
	
	public void printHello() {
		System.out.println("Hello~");
	}

	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		car1.goFoward(30);     //인수 전달되는값 
		car1.goBack();
		car1.doTest();
		
		MainClass mainClass = new MainClass();
		mainClass.printHello();   //.도트 접근 연사자 이용해서 호출하기

	}

}
