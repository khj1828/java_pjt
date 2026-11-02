package com.office.methodex01;

public class MainClass {

	public static void main(String[] args) {
		
		//메서드 오버로딩(과적): 메서드가 여러개 선언된 것을 말한다.
		/*
		Greet greet = new Greet();
		greet.printGreetWord();
		greet.printGreetWord("홍길동");
		*/
		//요구사항: 고객 이름 + 안녕하세요.(홍길동님 안녕하세요.)
		//모르는사람 + 안녕하세요. (안녕하세요.) 
		//이렇게 두개를 만들면 불편한점이 있다. 개수가 많아지고 메서드이름 다르게 만들어야한다..
		//자바에서는 이 불편을 해결하기 위해 동일한 이름의 메서드를 선언할 수 있는 메서드를 오버로딩이라고 한다. 
		//이름은 같지만 타입이 달라야 한다. 
		/*
		AddOperator addOperator = 
				new AddOperator();
		
		addOperator.add(10, 20);
		
		addOperator.add(1.5f, 2.5f);
		
		addOperator.add(3.14, 9.8);
		
		addOperator.add("hello", "world");
		*/
		
		Score score = new Score();
		score.printStudentScore(90, 80, 70);   //3명 
		score.printStudentScore(90, 80, 70, 100, 90);   //5명
		score.printStudentScore(90, 80, 70, 100);   //4명
		
	
	}
	

}
