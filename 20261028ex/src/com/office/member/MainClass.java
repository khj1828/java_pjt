package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Config config = new Config();
		
		Scanner scanner = new Scanner(System.in);
		
		//boolean systemFlag = true;
		Flag flag = new Flag();
		
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		
		
		if (config.IS_DEV) {
			MemberDumy memberDumy = new MemberDumy(memberDB);
			memberDumy.initMemberDumyData();
		}
		
		/*
		 * 과제 : 더미 데이터 초기화는 개발환경과 실환경으로 구분해야 한다.
		 */
		
	
		while (flag.systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    5.LIST    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
	
			
			
			switch (selectedMenu) {
			case Menu.Menu_SIGN_UP:            //SIGN-UP
				// memberService = new MemberService();
				memberService.doSignup(scanner);
				
				break;

			case Menu.Menu_SIGN_IN:            //SIGN-IN
		        // memberService = new MemberService();
		        memberService.doSignIn(scanner, flag);
				
				break;
				
			case Menu.Menu_MODIFY:            //MODIFY
				memberService.domodify(scanner);
				break;
				
			case Menu.Menu_DELETE:           //DELETE
				
				memberService.doDelete(scanner);
				
				break;
				
			case Menu.Menu_LIST:
			   // memberService.printAllMembers();
			    HashMap<String, Member> db = memberDB.memberDB;
			    
			    
			    
			    for (String key : db.keySet()) {
			    	Member member = db.get(key);
			    	System.out.println(member.memberId);
			    	System.out.println(member.memberPw);
			    	System.out.println(member.memberMail);
			    	System.out.println(member.memberPhone);
			    }
			    
			    db.values();
			    for(Member member : db.values()) {
			    	System.out.println(member.memberId);
			    	System.out.println(member.memberPw);
			    	System.out.println(member.memberMail);
			    	System.out.println(member.memberPhone);
			    }
			    break;
				
			case Menu.Menu_SYSTEM_OUT:          //SYSTEM-OUT
				flag.systemFlag = false;
				System.out.println("Say Good bye~");
				break;
				
				/*
				 * 과제: case에 사용되는 리터럴 상수 -> 상수변경  따로 menu클래스를 만들어서 ststic을 이용했다. 
				 * 과제 : 메뉴 5번 -> 전체회원정보출력하는기능(AI도움)
				 */
			}
			
			
			
		}
		
		scanner.close();

	}

}
