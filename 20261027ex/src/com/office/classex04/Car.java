package com.office.classex04;

public class Car {
	
	//멤버필드
	String color;
	int length;
	int price;
	int displacement;
	
	//생성자
	public Car() {
		System.out.println("--- CONSTRUCTOR ---");
	}

	public Car(
			String color, 
			int length, 
			int price, 
			int displacement) {
		this.color = color;
		this.length = length;
		this.price = price;
		this.displacement = displacement;
	}
	
	
	
	//메서드
	//int speed : parameter, 매개 변수,  받는값
	public void goFoward(int speed) {
		System.out.println("--- goFoward method ---");
		System.out.println(speed + "km/h");
	}
	
    public void goBack() {
    	System.out.println("--- goBack method ---");
	}
    
    public void doTest() {
    	goFoward(30);   //this.goFoward();
    	goBack();     //this.goBack();  붙여도 되고 안붙여도 된다.
    }
    
}
