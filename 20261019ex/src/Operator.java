
public class Operator {

	public static void main(String[] args) {
		
		/*
		 *  연산자 (operator)
		 *  산술연사자, 대입(복합) 연산자, 비교 연사자, 논리연산자, 조건식 연산자 등등...
		 */
		
		/*
	       *  산술 연산자   +, -, *, /, %, ++, --
	         할당 연산자   =, +=, -=, *=, /=, %=,( &=, |=)
	         비교 연산자   ==, !=, >, <, >=, <=
	         논리 연산자   &&, ||, !
	     */
		
		//1. 덧셈 연산
		// 1-1. 숫자덧셈
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 + num2: " + (num1 + num2));
		
		float num3 = 0.1f;
		float num4 = 0.2f;
		System.out.println("num3 + num4: " + (num3 + num4));
		
		//1-2. 문자열 덧셈
		String str1 = "Hello ";
		String str2 = "world ";
		System.out.println("str2 + str2: " + (str1 + str2));
		
		//1-3. 숫자+문자열 = 문자열 + 문자열  = 문자열(연결 연사자)
		System.out.println(10 +"Hello");   //10Hello
		System.out.println(3.14f +"Hello");   //3.14Hello

		
		
		//참고 : 문자덧셈
		System.out.println('A' + 'B');     //65+66=131 유니코드로 바뀌어서 연산된다
		System.out.println('가' + '나');    //44032+45208=89240
		
		//2. 뺄셈
		//2-1. 숫자뺄셈
		num1 = 10; num2 = 20;
		System.out.println("num1 - num2: " + (num1 - num2));
		
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 - num4: " + (num3 - num4));
		
		//2-2. 문자열 뺄셈(안된다)
		str1 = "Hello"; str2 = "world";
		//System.out.println("str1 - str2: " + (str1 - str2));   
		
		//참고 : 문자뺄셈
		System.out.println('A' - 'B');     //65-66=-1 유니코드로 바뀌어서 연산된다
		System.out.println('가' - '나');    //44032-45208=-1176
		
		//3.곱셈
		num1 = 10; num2 = 20;
		System.out.println("num1 * num2: " + (num1 * num2));
		
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 * num4: " + (num3 * num4));  //뒤에 쓰레기 데이터가 붙는다 
		
		
		System.out.println('A' * 'B');     //65*66=4290 유니코드로 바뀌어서 연산된다
		System.out.println('가' * '나');    //44032*45208=1990598656
		
		//4.나눗셈 
		num1 = 10; num2 = 20;
		System.out.println("num1 / num2: " + (num1 / (float)num2));   //0.5
		//0.5인데 0으로 표기됨 정수여서 실수가 표기되지 않고 4바이트 4바이트는 4바이트인데 
		//둘중 하나를 8바이트로 만들면된다(둘중아무거나) 20.0으로 바꿔줌
		
		num3 = 0.8f; num4 = 0.2f;
		System.out.println("num3 / num4: " + (num3 / num4));  //4.0
		
		
		System.out.println((int)'a');   //97
		System.out.println((int)'A');   //65
		System.out.println('a' / 'A');  //97/65 => 1.492307692307692  1나온다.
		
		System.out.println(0/100);  //0
		//System.out.println(100/0);  //에러
		
		
		//5. 나머지 연산자
		num1 = 10; num2 = 3;
		System.out.println("num1 % num2: " + (num1 % num2));   //1
		System.out.println('a' % 'A');  //32
		
		
		
		





	}

}
