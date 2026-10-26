package com.office.classex02;

public class Student {
	
	//속성
	String name;
	int grade;
	int age;
	String major;
	
	//생성자
	/*
	public Student(String n, int g, int a, String m ) {
		System.out.println("--- Constructor ---");
		
		/*
		name = "홍길동";
		grade = 1;
		age = 20;
		major = "Computer";         //생성자를 통한 속성 초기화 
		이렇게 하면 몇개를 해도 다 똑같은 값이 나와서 아래와 같이 해야한다
		
		
		name = n;
		grade = g;
		age = a;
		major = m;    //생성자 매개변수를 이용한 초기화
		*/
	
	public Student(String name, int grade, int age, String major ) {
		System.out.println("--- Constructor ---");
		
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.major = major;         //지역변수 전역변수 이름이 같아서 결과가 null 0 0 null이 나온다....앞에 전역변수를 바꿔야한다 그래서 this.를 붙인다
		                           //매개변수와 객체속성 이름이 동일해서 구분이 안된다
		                       //원래 name = name;  grade = grade;  age = age;  major = major;   name = name_;면 this안붙여도 된다.
		
	}
	
	//기능 (메서드)
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Age: " + age);
		System.out.println("Major: " + major);
	}

}
