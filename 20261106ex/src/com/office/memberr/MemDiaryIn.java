package com.office.memberr;

import java.util.Scanner;

public class MemDiaryIn {
	
	
        final int DIARY_WRITE = 1;
        final int DIARY_LIST = 2;
        final int LOG_OUT = 3;
	    
	    
	  public void execute() {
		  
		  Scanner scanner = new Scanner(System.in);
		  boolean diaryFlag = true;
		  
		  
		  String title;
	      String write;
		  
		  while(diaryFlag) {
				System.out.println("1.diary write    2.diary list    3.Log out ");
				int selectedMenuNum = scanner.nextInt();
				
				switch (selectedMenuNum) {
				case DIARY_WRITE:
	                System.out.println("제목을 입력하세요");
	                title = scanner.next();
	                
	                System.out.println("내용을 입력하세요");
	                write = scanner.next();	               
	         
	                
	                break;

	            case DIARY_LIST:
	                System.out.println("diary list");
	                break;

	            case LOG_OUT:
	                diaryFlag = false;
	                System.out.println("Log out.");
	                break;



	    }

	  }
	  
}
}
	
//	while(systemFlag) {
//		System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE  99.SYSTEM-OUT");
//		int selectedMenuNum = scanner.nextInt();
//	
//
//}
