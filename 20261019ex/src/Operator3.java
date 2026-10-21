
public class Operator3 {

	public static void main(String[] args) {
		
		/*
		 *  비교 연산자
		 *  크고 작음을 나타내는 연산자 입니다.
		 *  boolean 타입 true false
		 */
		
		System.out.println(10 < 20);  //true
		System.out.println(10 > 20);  //false
		
		System.out.println(10 <= 20);  //true
		System.out.println(10 >= 20);  //false
		
		System.out.println(10 == 20);  //false
		System.out.println(10 != 20);  //true
		
		//System.out.println(10 === 20);  //자바스크립트만 있음
		//System.out.println(10 !== 20);  //자바스크립트만 있음
		
		float num5 = 0.1f;    //0.10000000149   >double
		double num6 = 0.1;    //0.10000000000   > double  형변환후 연산이 이루어진다
		System.out.println("num5: " + num5);  //0.1
		System.out.println("num6: " + num6);  //0.1
		System.out.println("num5 + num6: " + (num5 + num6));  //0.200000...   가비지 데이터나옴
		System.out.println("num5 == num6: " + (num5 == num6));  //false
		System.out.println("num5 != num6: " + (num5 != num6));  //true
		
		System.out.println("num5 > num6: " + (num5 > num6));  //true
		System.out.println("num5 < num6: " + (num5 < num6));  //false 
		
		int num7 = 10;
		float num8 = 10.0f;
		
		//int + float => float + float // num7: 10.0 num8: 10.0
		
		System.out.println("num7 > num8 " + (num7 > num8));  //false
		System.out.println("num7 >= num8 " + (num7 >= num8));  //true
		System.out.println("num7 < num8 " + (num7 < num8));   //false
		System.out.println("num7 <= num8 " + (num7 <= num8));  //true
		System.out.println("num7 == num8 " + (num7 == num8));   //true
		System.out.println("num7 != num8 " + (num7 != num8));   //false
		
		//****************************************
		//문자열 비교 
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println("str1 == str2: " + (str1 == str2)); // true
		
		String str3 = new String("Hello");  
		String str4 = new String("Hello"); 
		System.out.println("str3 == str4: " + (str3 == str4)); // false 가지고있는주소가달라서
		
		System.out.println(str3.equals(str4));  //str3 == str4 true
		//문자를 비교할 때는 위에처럼 비교하지 말고 equals를 사용해서 비교하자!!**
		
		






	}

}
