package com.office.methodex;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calculator = 
				new Calculator()
;
		
		int rst = calculator.addOperlator(10, 20);
		System.out.println("rst: " + rst);
		
		//return 값을 안받으려면
//		int rst = calculator.addOperlator(10, 20); 이것만 쓰고 끝내면 된다
		
		//calculator를 이용해서 자동차 하나 가지고 싶어요
		Object mycar = calculator.productCar();
	}

}
