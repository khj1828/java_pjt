package com.office.inheri.restaurant;

public class ChildRestaurant 
                        extends ParentRestaurant 
                        implements CheckList, CheckList2{
	
	public final static int PARENT_MENU  = 1;
	public final static int CHILD_MENU   = 2;
	
	public void makeBokkeumbap() {
		System.out.println("아들꺼!볶음밥 만듦!!");
	}
	
	//@Override 두개 똑같을 때만 
	public void makeJajang(int menu) {
		if (menu == PARENT_MENU) {
			super.makeJajang();
		} else {
		//super.makeJajang();         //this 는 나를가리키고 super는 내 위에 를 가르킴 (한단계위)
		System.out.println("아들꺼!MZ세대 짜장면 만듦!!");  //아빠거 있지만 재정의 했다고 해서 오버라이드 찍으면 내거가 나온다.
		}
	}
	
	@Override
	public void makeTangsuyuk() {
		System.out.println("아들꺼!탕수육 만듦!!");
	}

	@Override
	public void checkFloor() {
		
		
	}

	@Override
	public void checkToilet() {
		
		
	}

	@Override
	public void checkHwagu() {
		
		
	}

}
