package com.office.ex;

import java.util.Scanner;

public class payController {
	
	/*
	 * 월급 지급 명령을 내린다.(지급하는게 아닌 컨트롤만)
	 */
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("please enter the month: ");
			int thisMonth = scanner.nextInt();
			
			payService payService = new payService();
			payService.pay(thisMonth);
			
		}
		
		
//		scanner.close();
	}

}
