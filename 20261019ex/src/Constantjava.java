
public class Constantjava {

	public static void main(String[] args) {
		
		/*
		 *  상수: 변하지 않는 수 (변수와다르게)
		 *  final 키워드 사용한다.
		 */
		
		//변수
		int num1 = 10;
		
		//상수(변수명은 대문자로 하기) 한번초기화되면 다른수로 바꿀 수 없다.
		final int NUM2 = 20;
		
		System.out.println("num1: " + num1);
		System.out.println("NUM2: " + NUM2);
		
	//  NUM2 = 30; 재저으이 안됨!
		
		final int PENCIL_PRICE = 1000;          // 정수
	    final float STUDENT_HEIGHT = 175.5f;    // 실수
	    final char GRADE = 'A';                 // 문자
	    final String COUNTRY = "Korea";         // 문자열

	    System.out.printf("PENCIL_PRICE : %d원 %n", PENCIL_PRICE);
	    System.out.printf("STUDENT_HEIGHT : %.2fcm %n", STUDENT_HEIGHT);
	    System.out.printf("GRADE : %c등급 %n", GRADE);
	    System.out.printf("COUNTRY : %s %n", COUNTRY);
	    
	    // 이클립스에서 소문자와 대문자를 변환 하는 단축키
	    //ctrl +shift + X ==> 대문자
	    //ctrl +shift + Y ==> 소문자
	    
	    //리터럴은 데이터 문자 자체를 뜻한다. 리터럴 상수  
	    


	}

}
