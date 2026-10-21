import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 데이터 타입
		 * 메모리에 저장할 데이터의 종류에 따라 할당 받는 메모리 크기가 다르게 되는데요, 
		 * 각각의 메모리 크기에 따라 데이터 종류를 구분하는 것을 말합니다.
		 * 
		 * 메모리 단위
		 * 1bit(비트) > 메모리 최소단위
		    8bit(비트) > 1byte(바이트)
		   1024Byte(바이트) > 1kb(키로 바이트)
		   1024kb(키로 바이트) > 1MB(메가 바이트)
		   1MB(메가 바이트) > 1GCB(기가 바이트)
		   1GCB(기가 바이트) > 1TB(테라 바이트)
		 */
		
		//정수 데이터 타입
		/*
		 * byte     1byte   -128 ~ 127
		 * short    2byte   -32,768 ~ 32767
		 * int      4byte   -2,147,483,648 ~ 2,147,483,647
		 * long     8byte   너무큰수 
		 */
		
		byte byteNum = 115;
		System.out.println("byteNum: " + byteNum);  //115
		
		byteNum = 127;
		//byteNum = byteNum + 1 
		
		byte byteNum01 = -128;
		System.out.println("byteNum01: " + byteNum01);  //-128
		
		byteNum01 = (byte)(byteNum01 - 1);
		System.out.println("byteNum01: " + byteNum01);  // 127 다시 뒤로 돌아가서 127이 된다.바이트로 덮어버린것이다.
		
		short shortNum = 22768;
		System.out.println("shortNum: " + shortNum);  //22768
		
		int intNum = 1147483648;
		System.out.println("intNum: " + intNum);   //1147483648
		
		int intNum01 = -2147483648;
		System.out.println("intNum01: " + intNum01);  //-2147483648
		
		intNum01 = intNum01 -1;
		System.out.println("intNum01: " + intNum01);   // -2147483649(x) 2147483647(o)

		
		
		long longNum = 7223372036854775808L;   //long타입은 오류가 난다 그래서 숫자맨뒤에 소문자나 대문자 L을 붙여야한다
		System.out.println("longNum: " + longNum); 
		
		//정수데이터 4가지의 값을 알아 볼때 
		System.out.println("byte 최솟값: " + Byte.MIN_VALUE);
		System.out.println("byte 최댓값: " + Byte.MAX_VALUE);
		
		System.out.println("short 최솟값: " + Short.MIN_VALUE);
		System.out.println("short 최댓값: " + Short.MAX_VALUE);
		
		System.out.println("int 최솟값: " + Integer.MIN_VALUE);
		System.out.println("int 최댓값: " + Integer.MAX_VALUE);
		
		System.out.println("long 최솟값: " + Long.MIN_VALUE);
		System.out.println("long 최댓값: " + Long.MAX_VALUE);
		
		//실수(부동소수점) 데이터 타입
		/*
		 * float     4byte
		 * double    8byte
		 */
		
		float floatNum = 3.14f;    //숫자 뒤에 f를 붙여줘야한다.
		System.out.println("floatNum: " + floatNum);   //3.14
		
		double doubleNum = 3.14159265358979;   //f붙이지 않는다.
		System.out.println("doubleNum: " + doubleNum);   //3.14159265358979
		
		System.out.println("float 최솟값: " + Float.MIN_VALUE);
		System.out.println("float 최댓값: " + Float.MAX_VALUE);
		
		System.out.println("double 최솟값: " + Double.MIN_VALUE);
		System.out.println("double 최댓값: " + Double.MAX_VALUE);
		
		float num1 = 3.14159265358979323846264338327950288f;
	    double num2 = 3.14159265358979323846264338327950288d;   //d를 붙이면 더 확실하다.
	    
	    System.out.println("num1: " + num1);         //num1: 3.1415927
	    System.out.println("num2: " + num2);         //num2: 3.141592653589793
	    
	    //논리 데이터 타입
	    // 참(true), 거짓(false)
	    // boolean   1byte  true, false
	    //true false 표기할때 파이썬만 앞에  t,f를 대문자로 한다
	    boolean flag = true;
	    System.out.println("flag: " + flag);
	    
	    // 문자와 문자열 데이터 타입
	    // 문자
	    /*
	     * 메모리에 문자 데이터를 저장하기 위해서 사용하는 데이터 타입
	     * char   2byte  
	     */
	    char ch = 'a';     //자바에서 문자는 ''작은따옴표만 가능
	    //char ch = "a";  x
	    System.out.println("ch: " + ch);
	    
	    ch = 'b';
	    System.out.println("ch: " + ch);
	    
	    //ch = 'hello';    x
	    
	    //빈문자(empty) 공백문자(space)  빈문자는 쓸 수 없고 공백문자는 한칸띄우니까 쓸 수 있다.
	    //char char1 = '';   데이터타입이 char인데 char는 문자가 1개는 있어야 하는데 공백이니까 error다
	    //char char2 = ' ';  //이렇게 한칸 띄우면 가능하다 공백문자
	    
	    // 문자는 메모리에 저장될 때 정수(유니코드)로 저장이 된다.
	    char char1 = 'A';
	    System.out.println("char1: " + char1);  //A
	    
	    int unicode = char1;
	    System.out.println("unicode: " + unicode);   //65(아스키코드에서 A가 65 이기 떄문에 )
	    
	    char char2 = 'ㄱ';
	    System.out.println("char2: " + char2);  //ㄱ
	    
	    unicode = char2;
	    System.out.println("unicode: " + unicode);   //12593
	    
	    char char3 = 65;
	    System.out.println("char3: " + char3);  //A
	    
	    char3 = 12593;
	    System.out.println("char3: " + char3);  //ㄱ
	    
	    //문자열
	    // String
	    /*
	     * byte, short, int. float, double, char 지금까니는 다 소문자 문자열은 대문자
	     */
	    String str1 = "Hello";
	    System.out.println("str1: " + str1);  //Hello
	    
	    /*
	     * str1 = "";  가능  빈문자
	     * str1 = "  "; 가능  공백문자
	     * 
	     */
	    
	    //콘솔을 이용한 데이터 입력, 출력
	    //데이터 출력
	    System.out.print("hello python");   //이게 먼저 생김
	    System.out.println("hello java");   //line의 약자 ln ln을 안쓰면 개행이 안된다
	    System.out.print("hello python\n");   //\n으로 개행
	    System.out.println("hello java"); 
	    
	    String str = "hello~";
	    System.out.println(str);
	    /*
	     * 특수문자정리
	     * \n  개행(줄바꿈)
	     * \t  탭(4칸공백)
	     * \'  작은 따옴표(')
	     * \"  큰 따옴표(")
	     * \\  역 슬래쉬(\)
	     */
	    
        System.out.print("이름\t학번\n");
        System.out.println("Mr. H\t2020_000123");
        System.out.println("Mr. H\t2020_000124");
        
        System.out.println("어머님께서는 \"밥 먹고 설거지 해놔라.\"라고 하셨습니다.");  //어머님께서는 "밥 먹고 설거지 해놔라."라고 하셨습니다.
        System.out.println("그래서 나는\'네.\'라고 했습니다.");   //그래서 나는'네.'라고 했습니다.
        
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");  //2개가짝이여서 홀수면 에러 
        System.out.println("\\\\\\2020-0801\\\\\\");  //\\\2020-0801\\\     
        
        
        //데이터 입력
        Scanner scanner = new Scanner(System.in);     // Scanner 클래스는 외부로부터 데이터를 입력받는 기능
        
       // String inputStr = scanner.nextLine();    //문자열을 사용자로부터 입력받는것
        //System.out.println("inputStr: " + inputStr);
        
        /*
         * nextByte()    : 정수 입력받을때 사용
         * nextInt()     : 정수 입력받을때 사용
         * nextLong()    : 정수 입력받을때 사용
         * nextFloat()   : 실수 입력받을때 사용
         * nextDouble()  : 실수 입력받을때 사용
         * nextLine()    : 문자열 입력받을때 사용
         * nextBoolean() : 논리 입력받을때 사용
         * 
         */
        
        //scanner.close();      //위에 scanner만 하면 외부자원을 끌어썼기에 안끄면 경고가 나와서 이렇게 꺼야한다.
        
       /* int inputInt = scanner.nextInt();     //10
        System.out.println("inputInt: " + inputInt);   //inputInt: 10
        
        scanner.nextLine();     이거는 앞에 int였고 line으로 하면 쓰레기 데이터가 생겨서 이렇게 하나 넣어주면 입력할 수있다.
        
        String inputString = scanner.nextLine();     //java    nextLine은 공백이 있건 뭐건 한줄 다 읽는다   
        System.out.println("inputString: " + inputString);     //inputString: java
        */
        
        String inputString = scanner.next();                //next는 첫 공백 까지만 읽고 다 버린다.
        System.out.println("inputString: " + inputString);
        
        //jana \n
        
        inputString = scanner.nextLine();     // java \n
        System.out.println("inputString: " + inputString);
        
        scanner.close();

		
       
	}

}
