package com.office.ex;

public class Daeri {
	
	//속성
	public String name = "Kim Daeri";
	//public int money;   //퍼블릭이라는 접근제어자 때문에 다른곳에서 쉽게 
	                    //접근해서 데이터를 가져가고 훼손시킬 수 있다. 조회도 마음껏 훼손도 마음껏
	private int money;    //조회도 훼손도 안된다 private
//	int money   default private + 같은 패키지 내에서 접근 가능 아무것도 쓰지 않은것  	
	
	
	//생성자  생성자는 무조건 public으로 해야한다. 
	public Daeri() {
		money = 1000000;
	}
	
	
	//메서드
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!!");
	}
	
	public void setMoney(int money, String ceoPW) {
		if (ceoPW.equals("1234")) {
		this.money = money;
		}
	}
	
	public int getMoney() {
		return this.money;
		
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	
}
