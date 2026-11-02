package com.office.ex;
/*
 * 싱글톤 클래스로 만들자
 */
public class PayCount {
	
	//속성
	private static PayCount payCount = null;
	private int cnt = 0;
	
	//생성자
	private PayCount() {
		
	}
	
	//메서드
	public static PayCount getPayCountInstance() {  //ststic을 넣어서 생성자가 private이라서
		if (payCount == null) {                     //객체가 생성이 안되니까 static은 다 들어갈 수 있으니 써준다
			payCount = new PayCount();              //속성에도 static을 붙여줘야 이아이를 찾아서 접근 할 수 있다. 
		}
		return payCount;
	}

	//조회
	public int getCnt() {
		return cnt;
	}

	//설정(초기화)
	public void setCnt() {
		this.cnt++;
	}
	
	

}