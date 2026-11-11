package com.office.exception;

public class StringEx {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Hello");
		
		System.out.println(stringBuffer);      //Hello
		//System.out.println(stringBuffer.toString());
		
		/*
		 * 문자열 추가
		 */
		stringBuffer.append("world");     
		System.out.println(stringBuffer);    //Helloworld
		
		/*
		 * 특정위치에 문자열 추가
		 */
	   stringBuffer.insert(5, "++");
	   System.out.println(stringBuffer);    //Hello++world
	   
	   /*
	    * 특정 범위 삭제
	    */
		stringBuffer.delete(5, 10);
		System.out.println(stringBuffer);    //Hellold
		
		/*
		 * 특정 위치 문자 삭제
		 */
		stringBuffer.deleteCharAt(5);
		System.out.println(stringBuffer);    //Hellod
		
		/*
		 * 문자열 교체
		 */
		stringBuffer.replace(2, 4, "LL");
		System.out.println(stringBuffer);    //HeLLod
		
		/*
		 * 문자열 뒤집기
		 */
		stringBuffer.reverse();
		System.out.println(stringBuffer);    //doLLeH
		
		/*
		 * 문자열 길이
		 */
		int length = stringBuffer.length();
		System.out.println("length: " + length);    //length: 6
		
		
		
		
		

	}

}
