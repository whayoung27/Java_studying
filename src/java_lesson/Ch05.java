package java_lesson;

//import java.util.*; 
////import java.util.Scanner ; 
//
////import : 불러오겠다 
////java 라는 폴더. (안에) util . 안에 있는 모든것(*)을 추가하겠다. 
////모든 것 중 하나가 scanner 그래서 java.util. scanner; 라고  적어도 okay



import java.util.*;

public class Ch05 {

	public static void main(String[] args) {
		
		
		// 00 입력문 ( 값 입력 받기, Scanner)
		
		// System . out 	: 표준 출력 스트림 생성 - 모니터 
		// System . in 	    : 표준 출력 입력 스트림 생성 - 키보드
		
		
		  // 실수
	      // nextDouble()
	      // nextFloat()
	      
	      // 정수
	      // nextInt()
	      // nextLong()
	      // nextByte()
	      // nextShort()
	      
	      // 논리
	      // nextBoolean()
	      
		
	
	      // 한 단어(String)
	      // next()
	      
	      // 한 줄(String)   // 한 줄 자체를 받겠다. 문장. 
		
	      // nextLine()
		
		
	
//		Scanner sc = new Scanner(System.in);
//		
//		//일단 외우기 :)
//		//Scanner 장치를 생성해 사용할 수 있도록 참조 변수 sc생성 및 연결 
//		
//		System.out.println(" ------ Scanner 예제 01 ------------");
//		System.out.println("정수를 하나 입력하세요 >> ");
//		String s = sc.next() ;  //밑에 실행창의 오른쪽 상단에 젤 왼쪽 보면 빨간불 들어와있는데 '실행중'이라는 의미 
//								//next() 	  : 한 문자열 (단어) , 띄워쓰기 기준으로 한 문자열만 가능 
//								//nextLine()  : 한줄 
//								//nextInt()   : 숫자로 나옴. 대신 변수 앞에 String 이 아니라 int로 바꿔야함. 
//
//		
//		System.out.println("입력한 문자열 : " + s  );
//		System.out.println();
//		
//		System.out.println("---------- scanner 예제 02 ----------------"); 
//		System.out.println("정수 세개를 입력해주세요 >>>> ");
//		
//		int num1 = sc.nextInt(); 
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3 ; 
//
//
//		sc.close() ; 		// 메모리 누수를 막아줌. 쓰지 않는 메모리 안돌아가게 닫기 . 
//							//객체생성하고   사용하지 않으면 제거하는 작업이 필요함 . 
//		
		
	      
//      ## 입출력 실습 예제 ##
//      System.out.println("--------------- Scanner 문제 01 ---------------");
//      문제 01)
      // 직사각형의 가로와 세로 값을 사용자로부터 입력받고 
      // 직사각형의 둘레와 넓이를 구하는 프로그램을 구현해보세요
      // 직사각형의 둘레 = (가로길이 + 세로길이) * 2
      // 직사각형의 넓이 = 가로길이 * 세로길이
		
		

		
		Scanner sc = new Scanner(System.in);				// **
		
//		System.out.println("직사각형의 가로와 세로 값을 입력하세요");
//		int a = sc.nextInt();								//**
//		int b = sc.nextInt();
//		
//		int result = ( a + b ) *2 ;
//		int result2 =  a * b ;
//		
//		
//
//		System.out.println("직사각형의 둘레 : " + result);
//		System.out.println("직사각형의 넓이 : " + result2);
//		System.out.println();
//		
		
		
      
      
//      문제 02)
//      System.out.println("--------------- Scanner 문제 02 ---------------");
      //이름을 입력하세요? 홍길동
      //홍길동 님의 나이를 입력하세요? 24
      //홍길동 님의 주소를 입력하세요? 대구광역시 반월 센트럴 타워
      // 홍길동 님의 나이는 24세 주소는 대구광역시 반월 센트럴 타워 입니다
		
		
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		sc.nextLine();				//**
		
		System.out.println("주소를 입력하세요");
		String address = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println(name + "님의 나이는" + age + "세 주소는 " + address + "입니다.");
		System.out.println();
		
		
		
		
		

	}

}
