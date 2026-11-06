package com.office.memberr;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;

		
		if (IS_DEV) 

			new MemberDumy().signUpForDumy(memberService);
		
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		MemberDto memberDto;
		
		while(systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE  99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case SIGN_UP:
				
				System.out.println("Input new member ID!!");
				memId = scanner.next();
				
				System.out.println("Input new member PW!!");
				memPw = scanner.next();
				
				
				if (memPw.length() < 4) {
					System.out.println("비밀번호는 4자이상 입력해주세요");
					memPw = scanner.next();
				}
					
				
//				if (memPw.length() < 4) {
//					System.out.println("비밀번호는 4자이상 입력해주세요");
//					return;
//				}
				
				System.out.println("Input new member MAIL!!");
				memMail = scanner.next();
				
				System.out.println("Input new member PHONE!!");
				memPhone = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				memberService.signup(memberDto);
				
				break;
				
            case SIGN_IN:
            	
            	
            	System.out.println("Input new member ID!!");
				memId = scanner.next();
				
				System.out.println("Input new member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null, null);
				
            	
//				memberService.signIn(memberDto);
				
				 MemberDto loginMember = memberService.signIn(memberDto);

				    if (loginMember != null) {
				        new MemDiaryIn().execute();
				    }

            	
				break;
				
            case MODIFY:
            	/*
            	 * ID, PW --> 인증 ok -> PW,MAIL,PHONE수정한다.
            	 */
            	
            	System.out.println("Input member ID!!");
            	memId = scanner.next();
            	
            	System.out.println("Input member PW!!");
            	memPw = scanner.next();
            	
            	memberDto = new MemberDto(memId, memPw, null, null);
            	
            	boolean isAuthentication =
            			memberService.doAuthenticationByMemIdAndMemPw(memberDto);
            	
            	if (isAuthentication) {
            		System.out.println("Input member PW!!");
            		memPw = scanner.next();
            		
            		System.out.println("Input member MAIL!!");
            		memMail = scanner.next();
            		
            		System.out.println("Input member PHONE!!");
            		memPhone = scanner.next();
            		
            		memberDto.setMemPW(memPw);
            		memberDto.setMemMail(memMail);
            		memberDto.setMemPhone(memPhone);
            		
            		memberService.modify(memberDto);	
            		
            	}
            	
            	
	            break;
	
            case DELETE:
            	/*
            	 * id & pw 인증 후 삭제
            	 */
            	
            	System.out.println("Input new member ID!!");
				memId = scanner.next();
				
				System.out.println("Input new member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null, null);
            	
            	memberService.delete(memberDto);	
	            break;
	
            case SYSTEM_OUT:
            	systemFlag = false;
            	System.out.println("good bye~");
	            break;

		
			}
			
		}
		
		scanner.close();
	}

}

