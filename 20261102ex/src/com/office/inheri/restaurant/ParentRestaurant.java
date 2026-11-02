package com.office.inheri.restaurant;

public abstract class ParentRestaurant {           //abstract 붙어서 추상클래스 추상메서드가 포함된 클래스
	
	
	//메서드
	public void makeJajang() {
		System.out.println("아빠꺼!자장면 만듦!!");
	}
	
	public void makeJjamppong() {
		System.out.println("아빠꺼!짬뽕 만듦!!");
	}
	
	//탕수육 만드는 기술 반듯이 익혀!!
	public abstract void makeTangsuyuk();     //abstract 붙어서 추상메서드 실체가 없는것  
	                                          //추상클래스 상속 밭으려면 이것을 의무적으로 구현해야 한다. 

}
