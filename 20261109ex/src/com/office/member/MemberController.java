package com.office.member;

import java.util.Scanner;

import com.office.menu.Menu;

public class MemberController {
	
	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
		
		
		
	}

	public void execute(Scanner scanner, int selectedMenu) {
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		
		switch (selectedMenu) {
		case Menu.MEMBER_SIGN_UP:
			
			System.out.println("Input new member ID!!");
			memId = scanner.next();
			
			System.out.println("Input new member PW!!");
			memPw = scanner.next();
			
			System.out.println("Input new member MAIL!!");
			memMail = scanner.next();
			
			System.out.println("Input new member PHONE!!");
			memPhone = scanner.next();
			
			
			int resultForSignUp = memberService.signup (
			 new MemberDto(memId, memPw, memMail, memPhone));
			
			
			
			
			
			break;
			
		case Menu.MEMBER_SIGN_IN:
			
			break;

	
	

	
		}

		
	}

}
