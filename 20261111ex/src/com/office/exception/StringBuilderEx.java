package com.office.exception;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		
		String str = "";
		
		long beforecurrentTime = System.currentTimeMillis(); /// 1000;      //1970년 1월1일 부터 현재까지의  밀리초, 초단위로 변환
		 
		for (int i=0; i < 500000; i++) {
			str += "s";
		}
		
		long aftercurrentTime = System.currentTimeMillis(); /// 1000;
		
		System.out.println("1.경과시간: " + (aftercurrentTime - beforecurrentTime));
		
		//System.out.println(currentTime);      
		
		
		System.out.println("---------------------------------------------------------");
		
		StringBuilder stringBuilder = new StringBuilder();
		
		beforecurrentTime = System.currentTimeMillis();
		
		for (int i=0; i < 500000; i++) {
			stringBuilder.append("s");
		}
		
		
		aftercurrentTime = System.currentTimeMillis();
		System.out.println("2.경과시간: " + (aftercurrentTime - beforecurrentTime));
		
	}

}
