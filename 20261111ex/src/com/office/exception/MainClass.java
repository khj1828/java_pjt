package com.office.exception;

public class MainClass {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
//		System.out.println("num1 + num2 = " + (num1 + num2));    //10
//		System.out.println("num1 / num2 = " + (num1 / num2));    //exception 
//		System.out.println("num1 - num2 = " + (num1 - num2));    //10
//		System.out.println("num1 * num2 = " + (num1 * num2));    //0    
//		//이렇게 되면 11라인에서 에러니까 아래는 실행이 안된다. 
		
		
		
		System.out.println("num1 + num2 = " + (num1 + num2));    //10
		
		/*
		 * 예외처리 문법 try ~ catch
		 */
		try {
			System.out.println("num1 / num2 = " + (num1 / num2));    //exception 
			
			System.out.println("+++++++++++++++++++++++");
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			//System.out.println(e.getMessage());  너무 대충 찍어준다
			System.out.println("FIRE ArithmeticException");
			e.printStackTrace();   //더 자세히 디테일하게 보여준다 
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("finally");
		//finally는 왜쓰느냐 예외가 발생하든 발생하지 않든 반드시 실행해야 하는 코드를 작성하기 위해서
		
		}

		System.out.println("num1 - num2 = " + (num1 - num2));    //10
		System.out.println("num1 * num2 = " + (num1 * num2));    //0    
		//이렇게 되면 11라인에서 에러니까 아래는 실행이 안된다. 
		
		
	
		
		
	}

}
