package java_lesson;
import java.util.Scanner;

public class Ch07 {
	public static void main(String[] args) {
		
		// 00 분기문
		// 조건문과 반복문 중간에서 코드블럭을 나눠서 처리하는 문법
		// 그 예로는 if문, switch문, for문, while문 등이 있다.
		
		// 01 if문
		// 조건문을 작성할 때 사용하는 구문.
		// 
		// 조건식이 참이라면 코드 블럭을 실행
		// 조건식이 거짓이라면 코드 블럭을 무시(스킵)
		// ++) else문을 통해 조건이 거짓일 경우의 실행코드를 지정 할 수 있다.
		

		// 조건식은 참 또는 거짓을 판단할 수 있는 식이여야만 한다.
		// 참과 거짓, 0과 1
		
		
		// 02 if문의 형식

		// 2-1) if문
		// 
//		 if ( 조건식 ) {
//												//
//												// 조건식이 참이라면 이 실행코드 실행
//												//
//		}
		
		
//		System.out.println("--------------- if문 - 간단 예제 ---------------");
//        Scanner scanner = new Scanner(System.in);
//        if (true) {
//            System.out.println("조건식이 참이고 if문 진입");
//        }
//        System.out.println("if문 처리 이후 실행코드");
//        System.out.println();
//
////        scanner.close();
//        
//        System.out.println("--------------- if문 - 예제 01 ---------------");
////        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("정수를 입력하세요 >>> ");
//        int num = scanner.nextInt();
//
//        // 첫번째 if문: 짝수 여부 체크
//        if (num % 2 == 0) {
//            System.out.println(num + "는 짝수입니다.");
//            System.out.println("첫번째 if문 끝.");
//        }
//
//        // 두번째 if문: 홀수 여부 체크
//        if (num % 2 == 1) {
//            System.out.println(num + "는 홀수입니다.");
//            System.out.println("두번째 if문 끝.");
//        }
//        System.out.println();

//        scanner.close();
        
        
        // 삼항연산자 연장선 예제
        // 두 수를 입력받아 큰수를 출력하세요(if문사용)
        
        
        
        // 두 수 입력 >>> 12 10
        // 큰 수 : 12
        
        // 1 . 삼항연산자로 큰 수를 출력
        
	
	     
//	     Scanner sc = new Scanner (System.in);
//	     int a = sc.nextInt();
//	     int b = sc.nextInt();
//	    
////	    
////	    		 
////	     System.out.println(  a > b ?  "큰 수 : " + a : "큰 수 : " + b );
////        
////        // if-else 문을 이용해서 큰 수를 출력
////        
////        
////       
////        
////        
//        if ( a > b  ) {
//        	
//        	System.out.println( "큰 수 : " + a  );
//      	
//        } else 
//          
//        
//        {
//        	System.out.println( "큰 수 : " + b );
//        }
        
        
     // IF-ELSE문 문제 02
        // 사용자로부터 두 정수를 입력받는다.
        // 그 수가 num >= 2 && num <= 20 이면
        // 조건식이 참이면 "2 ~ 20범위 안에 있습니다."
        // 조건식이 거짓이며 "범위를 벗어났습니다."
        // 위와 같은 결과값이 나오도록 코딩하세요 !
        

//	     Scanner sc = new Scanner (System.in);
//	     int num = sc.nextInt();
//	    
//	     
//	     if ( (num >=  2) && (num <= 20) ) {
//	        	
//	        	System.out.println( "2 ~20범위 안에 있습니다. ");
//	      	
//	        } else 
//	       
//	        {
//	        	System.out.println( "범위를 벗어났습니다." );
//	        }
//	     
        
		
//		If문 통합 문제 01)
    //   짝수이면서 3의 배수이면 출력
    //   홀수이면서 5의 배수이면 출력

//		Scanner sc = new Scanner (System.in);
//		int a = sc.nextInt();
//		
//		
//		if ( (a%2==0) && (a%3==0)){
//			
//			System.out.println(" 짝수이면서 3의 배수입니다. ");
//		} else { 
//			System.out.println("짝수이면서 3의 배수가 아닙니다.");
//		}
//			
//		if ( (a%2==1) && (a%5==0) ) {
//			System.out.println( "홀수이면서 5의 배수입니다. ");	
//			
//		}	else { 
//			System.out.println("홀수 이면서 5의 배수가 아닙니다.");
//		}
		
		// 선생님이 푼대로 풀어보기 다시. 짝수부터 먼저 체크하기. ++ 
		//꼭 두개를 같이 체크 하는 경우만아니면 나누어서 하는것이 좋다 .if 문. 
		
		
		
		 // else - if 문 문제 01)
        //시험 점수를 입력받아 90 ~ 100점은 A,
       //80 ~ 89점은 B, 70 ~ 79점은 C,
       //60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
       
       // score >= 90 A
       // score >= 80 B
       // score >= 70 C
       // score >= 60 D
       // 그외 F
       //or
       // score < 60 F
       // score < 70 D
       // score < 80 C
       // score < 90 B
       // 그외 A
		
//		Scanner sc = new Scanner (System.in);
//		int score = sc.nextInt();
//		
//		if ( score >= 90 ) {
//			System.out.println("A");
//		}
//		
//		else if (score >= 80) {
//			System.out.println("B");
//		}
//		
//		else if (score >= 70) {
//			System.out.println("C");
//		}
//		else {
//			System.out.println("F");
			
			//else if 를 사용할떄 적은것부터 사용하면 좋다 . 구체적인 내용을 다루는것을 먼저 하는게 좋다 . 그래야 
			//밑으로 가면서 쪼갤 수 있다. 
			// 문제 풀기 . 썜이 준 문제 . 
			
			
			
			
//		}

//		System.out.println("----------------- 중첩 if-else문 활용 예제 ------------------");
//		Scanner sc = new Scanner(System.in);
//		String id = "javaclass"; 		// ID
//		String pw = "test1234";			// PW
    
	
//
//	Scanner sc = new Scanner(System.in);
//	String id = "javaclass";
//	String pw = "test1234";
//	
//	System.out.println("아이디를 입력해주세요. \n >>>");
//	String inputId = sc.next();
//	System.out.println("비밀번호를 입력해주세요. \n >>>");
//	String inputPw = sc.next();
//	
//	if (id.equals(inputId) ) {								
//		System.out.println("아이디가 일치합니다." );				//아이디 일치 
//		System.out.println("비밀번호를 입력해주세요." );
//		String inputPw = sc.next();
//		
//		if (pw.equals(inputPw)) {
//			System.out.println("비밀번호가 일치합니다." );				//아이디 비밀번호 일치 
//			System.out.println("로그인 성공!" );
//			
//		}
//	}  else {
//		System.out.println("아이디가 맞지 않습니다.");  		//아이디 불일치 
//		System.out.println("아이디를 다시 입력해주세요");
//		String inputId = sc.next();
//			
//	}
//	
//	System.out.println("프로그램 끝");
	}
}

	
