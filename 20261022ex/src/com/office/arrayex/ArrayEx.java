package com.office.arrayex;

public class ArrayEx {

	public static void main(String[] args) {
		/*
		 * 배열 선언 방법
		 * 1. 데이터타입 [] 배열변수명  = {...}  방의 개수와 데이터가 집접 들어감
		 */
	
		int [] numbers1 = {1, 2, 3, 4, 5};
		
		/*
		 * 2. 데이터타입[] 배열변수명 = new 데이터타입[배열의길이] 빈방만 만들고 데이터를 넣지 않음 잘쓰지 않음.
		 */
		int [] numbers2 = new int[5];
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		numbers2[3] = 4;
		numbers2[4] = 5;
		
		
		/*
		 * 3. 데이터타입[] 배열변수명 = new 데이터타입 []{...}  정말 쓰지 않는 방식
		 */
		int[] numbers3 = new int[] {1, 2, 3, 4, 5};
		
		/*
		 * 배열 데이터 조회: 인덱스를 이용한 데이터 조회  인덱스는 무조건 0부터시작
		 */
		int[] scores = {80, 90, 100, 75, 60};
		System.out.println(scores[0]);     //80
		System.out.println(scores[1]);     //90
		System.out.println(scores[2]);     //100
		System.out.println(scores[3]);     //75
		System.out.println(scores[4]);     //60
		
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]: %d\n", i, scores[i]);
		}
		
		/*
		 * 배열 데이터 수정 : 인덱스(index)를 이용한 데이터 수정
		 */
		int[] points = {80, 70, 100, 60, 90};
		for(int i = 0; i < points.length; i++) {
			System.out.printf("points[%d]: %d\n", i, points[i]);
		}
		
		//foreach
		for (int point : points) {
			System.out.println("point: " + point);
		}
			points[0] = 800;
			System.out.printf("points[0] " + points[0]);   //800
		
		
		/*
		 * java의 배열 특징
		 * 1. 배열은 단일 데이터 타입만 저장 가능하다.
		 * let nums = [10, ,20, 30, 'hello'] 자바스크립트에서 갑자기 문자 넣어도 되지만 
		 * 자바는 int라고 했으면 무조건 인트만
		 * 
		 * 2. 최초 선언된 배열의 길이는 변경 불가하다.
		 * 
		 * 3. 존재하지 않는 인덱스를 이용하게 되면 에러발생한다
		 */
		/*2번
		int[] ns = {1, 2, 3};   //length:3
		
		ns = new int[5];*/
		
		//3번
		int[] ns = {1, 2, 3};   //length:3
		System.out.println(ns[2]);  //3
//		System.out.println(ns[3]);  //에러발생
		System.out.println("+++++");  //에러발생
		
		/*
		 * 배열을 이용해서 학급 학생의 시험 성적, 총정, 평균을 출력하자!
		 */
		
		int[] sudentScores = {80, 95, 100, 70, 68, 74, 88, 98, 100, 76};
		int total = 0;         //총합
		float average = 0.0f;  //평균
		
		for (int i = 0; i < sudentScores.length; i++ ) {
			//학생 개인 점수 출력
			System.out.printf("sudentScores[%d] score: %d\n", i,  sudentScores[i]);
			
			//총학
			total +=  sudentScores[i];
		}
	    
		//총합 출력
		System.out.println("Total score: " + total);   //849
		
		// 평균 출력
		average = total / sudentScores.length;
		System.out.println("Average: " + average);
		
		// 값이 없는 배열의 초기값은?
		int [] classes = new int[5];    //00000
		for (int i = 0; i < classes.length; i++) {
			System.out.println(classes[i]);
		}
		
		float[] averages = new float[5];    //0.0
		for (int i = 0; i < averages.length; i++) {
			System.out.println(averages[i]);     //0.0 다섯개
		}
		
		/*
		 * 배열복사
		 */
		
		int number1 = 10;
		int number2 = 20;
		
		System.out.println("number1: " + number1);   //10
		System.out.println("number2: " + number2);   //20
		
		number2 = number1;
		
		System.out.println("number1: " + number1);   //10
		System.out.println("number2: " + number2);   //10
		
		number1 = 100;
		System.out.println("number1: " + number1);   //100
		System.out.println("number2: " + number2);   //10   복사되어도 영향을 받지 않는다.
		
		int[] numbers = {1, 2, 3};
		int[] numbersCopy = numbers;
		
		System.out.println("numbers: " + numbers);      //메모리 주소 [I@62bd765
		System.out.println("numbersCopy: " + numbersCopy);   //메모리 주소 [I@62bd765  같은 메모리 주소로 같이 동일한 배열을 가리킨다
		
		for(int i = 0; i <numbers.length; i++) {
			System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
		}
		
		for(int i = 0; i <numbers.length; i++) {
			System.out.printf("numbersCopy[%d]: %d\n", i, numbersCopy[i]);
		}
		
		numbers[0] = 100;
		System.out.println(numbersCopy[0]);  //100
		
		//깊은 복사
		//int[] numbers = {1, 2, 3};  ---> int[] numbersDeepCopy
		int[] numbersDeepCopy = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			numbersDeepCopy[i] = numbers[i];
		}
		
		for(int i = 0; i < numbersDeepCopy.length; i++) {
			System.out.printf("numbersDeepCopy[%d]: %d\n", i, numbersDeepCopy[i]);
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("numbersDeepCopy[%d]: %d\n", i, numbers[i]);
		}
		
		numbersDeepCopy[2] = 3000;
		
		System.out.println("numbersDeepCopy[2]: " + numbersDeepCopy[2]);
		System.out.println("numbers[2]: " + numbers[2]);
		
		
		//배열삭제
		int[] myScores = {80, 90, 100};
		System.out.println("myScores: " + myScores);  //메모리주소 [I@23a5fd2
		
		myScores = null;   //이순간 연결이 끊어짐 
		System.out.println("myScores: " + myScores);    //null
		
		
		
		//2차원 배열
		int[][] mns = new int[3][2];
		System.out.println("mns: " + mns);   //[[I@78a2da20  2차원이라 [[두개 나온다.
		
		/*
		 * int[] myScores == int myScores[]  잘안쓰지만 뒤에 써도 된다.
		 * 		int[][] mns == 		int mns[][]    비추
		 */
		
		//1
		int[][] mmns = {{1,2}, {10,20}, {100,200}}; // 3x2
		
		//2
		int[][]mmmns = new int[3][2];
		mns[0][0] = 1;
		mns[0][1] = 2;
		mns[1][0] = 10;
		mns[1][1] = 20;
		mns[2][0] = 100;
		mns[2][1] = 200;
		
		//3
		int[][] mmmmns = new int[][] {{1,2}, {10,20}, {100,200}};
		
		//데이터 조회
		System.out.println(mmmmns[0]);  //2차원 배열의 주소[I@dd3b207
		System.out.println(mmmmns[0][0]);   //2차원 배열의 값  1
		//System.out.println(mmmmns[0][2]);   //없는 값이면 에러발생 
		
		mmmmns[0][0] = 1000;
		System.out.println(mmmmns[0][0]);  //1000

	}

}
