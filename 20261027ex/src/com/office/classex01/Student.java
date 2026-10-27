package com.office.classex01;

public class Student {
	
	//속성 == attribute == 멤버필드(*)  (꼭 3가지 다 알기)
	String name;                   //이름
	int grade;                    //학년
	int age;                      //나이
	String major;                  //전공
	
	
	//생성자 컨트롤 스페이스 누르면 바로 생성
	public Student(String name,
			int grade,
			int age,
			String major) {
		System.out.println("-- CONSTRUCTOR --");
		
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.major = major;
	}
	
	//기능 == 메서드(*)  메서드 네임은 동사 + 명사 -> ai 한테 물어보면 잘 알려준다!
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Age: " + age);
		System.out.println("Major: " + major);
		
	}

}
