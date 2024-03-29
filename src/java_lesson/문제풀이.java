package java_lesson;

import java.util.Scanner;

public class 문제풀이 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		String id = "javaclass";  					//**정의하는것 
//		String pw = "test1234";						//**정의하는것 유의
//		
//		System.out.println("아이디를 입력해주세요. \n >>>");
//		String inputId = sc.next();
//	
//		
//		if (id.equals(inputId) ) {								
//			System.out.println("아이디가 일치합니다." );				//아이디 일치 
//			System.out.println("비밀번호를 입력해주세요. \n" );
//			String inputPw = sc.next();
//			
//			if (pw.equals(inputPw)) {
//				System.out.println("비밀번호가 일치합니다." );				//아이디 비밀번호 일치 
//				System.out.println("로그인 성공!" );
//				
//			}
//		}  else {
//			System.out.println("아이디가 맞지 않습니다.");  		//아이디 불일치 
//			System.out.println("아이디를 다시 입력해주세요");
//		              // *** >>> 반복문에서 사용할 수 있음. 순서대로 하기때문에 여기서다시 재입력
//															//받는것은 불가능. 
//		
//				
//		}
//		
//		System.out.println("프로그램 끝");
//		}

	

//	If문 통합 문제 01)
//	짝수이면서 3의 배수이면 출력
//	홀수이면서 5의 배수이면 출력
	
//		Scanner sc = new Scanner (System.in);
//		int a = sc.nextInt();
//	
//		if (a%2 == 0) {
//			
//			if (a%3==0) {
//			System.out.printf( "%d는 짝수이면서 3의 배수입니다.", a );
//			} else { 
//				System.out.printf("%d는 짝수이면서 3의 배수가 아닙니다.", a);
//			} 
//		} else {
//			if (a%2==1) {
//				System.out.printf("%d는 홀수이면서 5의 배수입니다.", a); 
//			} else {
//				System.out.printf("%d는 홀수이면서 5의 배수가 아닙니다.", a);
//			}
//		}
//	}
//
	
	
	 
//	 05 else - if 
//    다중분기
//      System.out.println("--------------- else-if문 예제 01 ---------------");
//      System.out.print("나이 입력 : >>> ");
//      int age = sc.nextInt();
//
//      if (age >= 20) {
//          System.out.println("성인입니다.");
//      } 
//      
//      
//      else if (age >= 8) {
//          System.out.println("취학 아동입니다.");
//      } else {
//          System.out.println("미취학 아동입니다.");
//      }
      
      
      
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
//  System.out.println("--------------- else-if문 문제 01 ---------------");
//  	Scanner sc = new Scanner(System.in);
//  	int score = sc.nextInt();
//  	if (score >= 90) {
//  		System.out.println("A");
//  	}
//  	else if (score >= 80) {
//  		System.out.println("B");
//  	}
//  	else if (score >= 70) {
//  		System.out.println("C");
//  	}
//  	else if (score >= 60) {
//  		System.out.println("D");
//  	}
//  	else {
//  		System.out.println("F");
//  	}
  



//나이별로 요금을 부과하는 else if문을 만드세요
		//8세 미만  : 요금은 1000원
		//14세미만 : 요금은 2000원
		//20세미만 : 요금은 2500원
		//20세이상 : 요금은 3000원
	
	
//	Scanner sc = new Scanner(System.in);
	
//	int charge = 0 ; 
//	int age = sc.nextInt();
//	
//	
//	if (age < 8) { 
//		charge = 1000; 	
//		}
//	
//	else if (age < 14)
	


//	Scanner sc = new Scanner(System.in);
//	
//	int charge = 0;
//	
//	int age = sc.nextInt();
//	
//	
//	if (age < 8) {
//		charge = 1000;
//	}
//	else if (age < 14) {
//		charge = 2000;
//	}
//	else if (age < 20) {
//		charge = 2500;
//	}
//	else {
//		charge = 3000;
//	}
//	System.out.printf("나이 : %d 요금 : %d\n", age, charge);


		

		//문제

		//배달도시락을 주문하는데 10개까지(n<=10)는 개당 2500원이고 10개(n>10)를 초과하는 양에 대해서는 개당
		//2400원이다.배달 도시락의 개수를 입력 받아서 금액을 계산하는 프로그램을 작성합니다
		
//		Scanner sc = new Scanner(System.in);
//		int dosirak = sc.nextInt();
//		
//		if (dosirak <= 10) {
//			System.out.println("주문 도시락 가격 :" + dosirak * 2500);
//		} else { 
//			System.out.println("주문 도시락 가격 :" + dosirak * 2400);
//		}
		

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("주문 도시락 수: ");
//        int num = scanner.nextInt();
//
//        if (num <= 10) {
//            System.out.println("도시락 주문 총액: " + num * 2500);
//        } else {
//            System.out.println("도시락 주문 총액: " + num * 2400);
//        }



		//디스켓 1통에 5000원한다.그런데 한번에 10통이상(n>=10)을 사면 전체 금액의 10 % 를 할인하여준다
		//그리고 100통이상(n>=100)을 사면 전체 금액의 12 % 를 할인하여 준다 n개의 디스켓을 사려면 얼마가
		//있어야 하는지 계산하세요
		
//		Scanner sc = new Scanner (System.in);
//		int cookie_num = sc.nextInt();
//		
//		
//		
//
//		
//		if (cookie_num >= 10) { 
//			System.out.println( "총액 : " +  (int) ((cookie_num*5000)*0.9 )+"원");
//		} 
//		
//		else if (cookie_num >= 100) {
//			System.out.println("총액 : " +  (cookie_num*5000)*0.88 +"원");
//		}
//		
//		else {
//			System.out.println("총액 :" + cookie_num*5000 + "원");
//		}
// 



		
System.out.println("--------------- while문 예제 03 ---------------");
//1부터 N(입력한 수)까지의 합 구하기 


//Scanner sc = new Scanner (System.in);
//int n = sc.nextInt();
//
//int sum = 0;   			
//						//
//int i = 1;
//
//
//	while (  i <= n ) {
//		sum += i; 
//		
//		i++;
//	}
//	System.out.println("1부터 n까지의 합은" + sum +"입니다."); 





//문제
//System.out.println("--------------- while문 문제 01 ---------------");
//정수 두개를 입력 받아(n,m) n부터 m까지의 합을 구하세요. //이때 받는 수는 n이 m보다 작아야 합니다(제약조건)


	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
//	
	int sum = 0;

////					// 선언할 떄 왜 이렇게 안됨?
//	while (n < m ) {
//		int sum = n++;}
//	     System.out.println(sum); 
//	
//	    
	
//////	
	if ( n < m ) {
		while ( n < m) {
		sum += n;							//** sum... 
		n++;
		}
		System.out.println("합 : " + sum );
		}  
	else if ( n >m ){
		while (m < n) {
		sum += m; 
		m++;
		}
	
	System.out.println("합 : " + sum );

	} else {
		System.out.println("n과 m의 합이 같습니다." );  //** 나머지 경우의 수 . 빠진 경우의 수가 없는지 확인해야함. 아니면 아예
													//아예 else if를 사용하지말고 else구문을 사용하는 것도 방법이다. 
													//또는, else if 문의 조건식에 아예 나머지 경우의 수까지 처리를해주는
												//방법도 있다 ... 복습할때 쌤 자료 꼭 보기 ch09	
	}
	}
}
		



				
		
		
	
		
