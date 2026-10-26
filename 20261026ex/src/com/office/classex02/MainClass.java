package com.office.classex02;

public class MainClass {

	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동", 1, 20, "Computer");
		Student student2 = new Student("박찬호", 1, 21, "Sports");
		//Student student1 = new Student();
		/*
		System.out.println("name; " + student1.name);     //null       string은 null int는 0 float는 0.0		
		System.out.println("name; " + student1.grade);    //0
		System.out.println("name; " + student1.age);      //0          
		System.out.println("name; " + student1.major);    //null    생성자 호출에서 속성을 다 입력해서 초기화 했으니 그 값이 나온다. 생성자를 통한 속성 초기화
		*/
		student1.printInfo();
		student2.printInfo();
		
		Student student3 = new Student("김경문", 2, 22, "Baseball");
		student3.printInfo();
		

	}

}
