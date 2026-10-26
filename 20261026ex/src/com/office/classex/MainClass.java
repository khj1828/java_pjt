package com.office.classex;

public class MainClass {

	public static void main(String[] args) {
		
	    Car car1 = new Car();        //Car 는 내가 만든 데이터타입
	    System.out.println(car1.Color);      //Black
	    System.out.println(car1.size);       //5.2
	    System.out.println(car1.displacement);     //2000
	    
	    car1.drive();
	    car1.stop();
	    car1.parking();
	    
	    car1.callAllMethod();    // 세가지 전부 출력한것
	    
	    car1.Color = "Yellow";
	    System.out.println("car1 color: " + car1.Color);    //Yellow
	    
	    
	    Car car2 = new Car();
	    System.out.println("car2 color: " + car2.Color);    //Black
	    car2.Color = "white";
	    System.out.println("car2 color: " + car2.Color);     //white
	    
	    
	    Car car3 = new Car(); 
	    System.out.println("car3 color: " + car3.Color);    //Black
	    
	    car3 = car2;
	    
	    car3 = null;
	    
	    
	    
	    
	
 

	}

}
