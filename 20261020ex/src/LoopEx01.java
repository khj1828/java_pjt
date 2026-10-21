import java.util.Scanner;

public class LoopEx01 {

	public static void main(String[] args) {
		
		/*
		 *  while문
		 * 조건에 의한 반복문
		 * while(조건식){
		 *    실행문
		 *   }  조건을 만족 할동안 계속 돌아라 
		 */
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}
		
		int i = 0;
		while (i < 5) {
			System.out.println("Hello");
			i++;  //이거 하지 않으면 무한루프돈다
		}
        */
//		
//		int i = 0;
//		boolean flag = true;
//		while (flag) {
//			System.out.println("i : " +i);
//			i++;        //여기까지 하면 무한루프
//			
//			if (i > 100)
//				flag = false;   //이렇게 해주면 i가 빠져나올 수 있다.
//		}
		
		// do ~ while문  조건에 만족을 하든 안하던 무조건 한번은 실행
		/*int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
			
		} while(i <= 10);
		
		System.out.println("sum: " + sum);  
		//이렇게 쓸거면 그냥 while문 쓰거나 for문 쓰는게 낫다.
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int condition = 0;
		
		do {
			System.out.println("우유를 배송한다.");
			System.out.println("정기 배송 진행 여부를 선택한다.");
			
			System.out.println("1.맛있다.   2.맛없다.");
			condition = scanner.nextInt();
			
			if (condition == 2) {
				System.out.println("그만 배송 하세요.");
			}
			
		} while(condition == 1);
		
		scanner.close();
	}

}













