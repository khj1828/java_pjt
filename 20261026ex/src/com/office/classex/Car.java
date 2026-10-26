package com.office.classex;

public class Car {
	
	
	//속성
	String Color = "black";
	double size = 5.2;    
	int displacement = 2000;    //배기량
	
	//생성자
		public Car() {
			System.out.println("Car CONSTRUCTOR CALLED!!");
		}
	
	//기능
	public void drive() {
		System.out.println("drive() CALLED!!");
		
	}
	
	public void parking() {
		System.out.println("parking() CALLED!!");
		
	}
	
	public void stop() {
		System.out.println("stop() CALLED!!");
		
	}
	
	public void callAllMethod() {
		drive();
		parking();
		stop();
	}

}
