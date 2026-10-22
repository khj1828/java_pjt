import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		
		//안녕하세요. 를 5회 출력하자
		//for(초기화; 조건식; 단계)
	    //for(반복의 시작; 끝; 단계)
		
		//for (int i = 1; i < 6; i++) {
		//	System.out.println("안녕하세요.");
		//}
			
		//for (int i = 1; i < 6; i += 2) {
		//	System.out.println("안녕하세요.");
		//}
			
		//int j = 0;
		//for (j=5; j < 10; j += 2) {
		//	System.out.println("Hello.");
		//}
		
		//for(int k=0; k < 10; k++) {
		//	System.out.println("0");
		//}
		
		//1부터 사용자가 입력한 정수까지의 합을 구하는 프로그램을 만들어보자.
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 입력하세요.");
		int inputData = scanner.nextInt();
		
		int sum = 0;
		for(int i =1; i <= inputData; i++) {
			sum += i;
			
			System.out.println("sum: " + sum);
		}*/
		
		//3단 구구단 출력
		//for (int i = 1; i < 10; i++) {
//			System.out.println("3 * " + i + " = " + (3 * i));
		//	System.out.printf("3 * %d = %d%n", i, (3*i));
		//	System.out.println(String.format("3 * %d = %d%n", i, (3*i)));
			
			// 전체구구단 (가로모드, 세로모드 ) 출력하자
//			가로모드
//		for(int i = 1; i < 10; i++) {
//	         for(int j = 1; j <10; j++) {
//	            if(j == 9) {
//	               System.out.printf("%d X %d = %d%n", j, i, (j*i));
//	            } else {
//	               System.out.printf("%d X %d = %d\t", j, i, (j*i));
//	            }
//	         }
//	      }
//		
//		세로모드
//		for(int i = 1; i < 10; i++) {
//	         for(int j = 1; j <10; j++) {
//	            System.out.printf("%d X %d = %d%n", i, j, (i*j));
//	         }
//	      }
		
//		boolean flag = true;   //무한루프 프로그램은돌지만 시스템 터지니 조심!
//		for(int i = 1; i < 10; i++) {
//			 System.out.println("i: " + i);
//			if (i > 10)  
//				flag = false;           //둘중한개 이거랑 아래거
//				break;         //이렇게 조건을 걸어두면 무한루프에서 빠져나옴 
//		}
//		
//		
//        for(double d= 0.0; d < 1; d += 0.1) {
//        	System.out.printf("d: %f \n", d);
//        }
        
        /*
         * 0.0
         * 0.1
         * 0.2
         * 0.3
         * 0.4
         * 0.5
         * 0.6
         * 0.7
         * 0.8
         * 0.9    --->10회반복  그러나 실행시키면 가비지 데이터때문에 11번반복 그러니 double 쓰지 말고 int쓰자!
         */
		
		//*********************
		//중첩 for문을 이용할때 절대 3단계 이상을 사용하지 말자! 
		for (int i=0; i <10; i++) {
			for(int j=0; j < 10; j++) {
				for (int k=0; k < 10; k++) {
					//반복이 많아서 두단계까지는 괜찮지만 세단계부터는 cpu가 힘들어하고 느려지고 느려지다 셧다운됨
				}
			}
		}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 숫자가 늘어나도록 별찍기
		 */
		
		for(int i=1; i <= 5; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j= 0; j <= 5 - i; j++) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****    
		 */
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/* 과제 
		 *    *
		 *   ***
		 *  *****
		 * ******* 
		 *   
		 */
		
            for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		//달력만들기 (이거는 for문 거의 필수!!)
		
		System.out.println("MOT\tTUE\tWED\tTHU\tFRI\tSAT\tSUN");
		int offset = 3;
		int day = 1;
		
		for (int i = 0; i < 5; i++) {
			
			//-
			for (int j = 0; j < offset; j++) {
				System.out.print(String.format("%3c\t", '-'));
			}
			
			
			for (int j = 0; j < 7 - offset; j++) {              //j 0일때 1 j가 1일때 2 2일떄3 3일때4
				
				if (day <=30) {
					System.out.print(String.format("%3d\t", day));
					day++;
				} else {
					System.out.println(String.format("%3c\t", '-'));
				}
			}
			offset = 0;
		    System.out.println();
				
		}
		
            for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		

	}

}
