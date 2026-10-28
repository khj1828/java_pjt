package com.office.member;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;
		MemberDB memberDB = new MemberDB();
		
		MemberService memberService = new MemberService(memberDB);
		
		MemberDumy memberDumy = new MemberDumy(memberDB);
		memberDumy.initMemberDumyData();
		
		/*
		 * 과제 : 더미 데이터 초기화는 개발환경과 실환경으로 구분해야 한다.
		 */
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    5.LIST    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			final int SIGN_UP = 1;
			final int SIGN_IN = 2;
			final int MODIFY = 3;
			final int DELETE = 4;
			final int LIST = 5;
			final int SYSTEM_OUT = 99;
			
			
			switch (selectedMenu) {
			case SIGN_UP:            //SIGN-UP
				// memberService = new MemberService();
				memberService.doSignup(scanner);
				
				break;

			case SIGN_IN:            //SIGN-IN
		        // memberService = new MemberService();
		        memberService.doSignIn(scanner);
				
				break;
				
			case MODIFY:            //MODIFY
				memberService.domodify(scanner);
				break;
				
			case DELETE:           //DELETE
				
				memberService.doDelete(scanner);
				
				break;
				
			case LIST:
			    memberService.printAllMembers();
			    break;
				
			case SYSTEM_OUT:          //SYSTEM-OUT
				systemFlag = false;
				System.out.println("Say Good bye~");
				break;
				
				/*
				 * 과제: case에 사용되는 리터럴 상수 -> 상수변경
				 * 과제 : 메뉴 5번 -> 전체회원정보출력하는기능(AI도움)
				 */
			}
			
			
			
		}
		
		scanner.close();

	}

}
