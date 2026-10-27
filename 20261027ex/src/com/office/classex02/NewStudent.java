package com.office.classex02;

import java.security.PublicKey;

public class NewStudent {
	
	//속성 멤버필드
	int grade = 1;         //학년
	int classNo;      // 반번호
	int studentNo;     //학생개인번호
	String studentName;      //학생이름
	boolean absence = false;           //휴학구분 (true: 휴학, false: 재학
	
	
	/*
	 * 생성자 오버로딩이란,  생성자가 과적(넘치는것)했다ㅏ는 의미입니다. 생성자를 여러개 만드는것 어떤것은 grade가있고 어떤건 없고 
	 */
	//생성자
	//경우의수 3개 1개만 받는거 2개 3개 받는거 자동와성하기
	public NewStudent() {
		
	}
	
	public NewStudent(int grade, int classNo, int studentNo, String studentName, boolean absence) {
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}
	

	
	public NewStudent(int classNo, int studentNo, String studentName, boolean absence) {
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}
	
	


	public NewStudent(int classNo, int studentNo, String studentName) {
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	
	

	public NewStudent(int grade, int classNo, int studentNo, String studentName) {
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}



	/*public NewStudent( 
			int classNo,
			int studentNo,
			String studentName) {
			//boolean absence) {
		System.out.println("--- CONSTRUCTOR ---");
		
		
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		//this.absence = absence;

		
	}
	
	public NewStudent(
			int grade, 
			int classNo,
			int studentNo,
			String studentName) {
			//boolean absence) {
		System.out.println("--- CONSTRUCTOR ---");
		
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		//this.absence = absence;

		
	}
	*/
	 //메서드
    public void printInfo() {
    	System.out.println("학년: " + grade);
    	System.out.println("반번호: " + classNo);
    	System.out.println("학생개인번호: " + studentNo);
    	System.out.println("학생이름: " + studentName);
    	System.out.println("휴학구분: " + absence);
    
    }

		
		
		
		
		
	}
	


