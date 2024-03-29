package java_lesson;
import java.util.*;


public class Ch09 {

	public static void main(String[] args) {
//		
//		System.out.println("-----------while 문 예제 01 -----------------");
//		
//		
////		//**while 문에서는  꼭 3개 생각하기 . 외워주기 3개의 연산이 꼭 필요하다.  //
//		
//		//탈출용 변수 
//		int i = 1;
//		
//		//탈출용 조건식 
//		while ( i <= 10 ); {
//			System.out.println("Hellow World");
//
//			//탈출을 위한 연산식 
//			i++; // 후치 연산 . 
//		}
//		
//	// 이전에는 헬로월드를 10번 찍었다면 지금은 한줄로 가능. 
//		
//		System.out.println("-----------while 문 예제 02 -----------------");
//		
//		
//		// 1부터 10까지 합 구하기 
//		
////		int i = 1;
////		int sum = 0;
////		
////		while (i <= 10 ) {
////			System.out.println( "i = " +1);
////			sum += i ; 	 	// sum = sum + i ; 
////			i++ ;       	// 후치연산 
////		}
////		
//		System.out.println("while 종료 후 i 의 값 =" + i);
//		System.out.println("1부터 10까지의 합=" + sum);
//		
//		
//		 System.out.println("--------------- while문 예제 03 ---------------");
////       1부터 N(입력한 수)까지의 합 구하기 
//		 
		
		 
		
		
//		
//		int i = 1;
//		int sum = 0;
//		
//		while (i <= 10) {
//			
//			System.out.println( "i의 값 : " + i );
//			sum  = i + sum  ;  //복합 대입 연산자.  변수는 선언을 다시 가능하기 때문에 . 
//			i++;
//			
//		}
//		
		
		
		
		//02 do = while 문의 구조 
		// while 문은 조건식이 거짓이면 실행 x 
		//do - while문은 무조건 한번 실행 후 조건식 판별 
		
		
		//do {     									//일단 해라. 
		// 조건식 판별 전 실행할 코드;    //조건식 상관없이 실행 
		//반복적으로 실행될 코드 ; // 조건식에 따라 실행 
		
		//whi
		
		
		
	
		//문제 
        System.out.println("--------------- while - if문 문제 01 ---------------");
        //입력한 1부터 입력 수중(x)에 3의 배수의 합을 출력
        
//        Scanner sc = new Scanner (System.in);
//        int num = sc.nextInt();			//입력한 수를 저장하는 num 
//        int i = 1;						// 1부터 반복 되어야 하니까 . 무조건 변수 생성. 
//        int sum = 0;					// 합의 초기화
//        
//        while ( i <= num ) {			// 1 - n 까지 반복 .반복할 횟수 
//        								// 1부터 n까지 숫자 저장 
//        	if ( i %3 == 0 ) {			//i 가 3일떄만 if 문에 들어오니까 . 
//        		sum += i;
//            
//            	}
//        	i++;
//        }
//            		
//       
//        System.out.println(" 1부터 " + num +"까지 3의배수의합 :" + sum );
        
        
      //입력한 1부터 입력 수중(x)에 3의 배수의 합을 출력
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int i = 1;  // 반복 
        int sum = 0; //초기화
       
        
        while (i <= num) { 
        	if( i%3==0) { 
        		sum+=i; 
        	}
        	i++;
   
        }System.out.println("어 ");
        	
        
        
//        
        	
     
        
		
        
        //문제 
        System.out.println("--------------- while - if문 문제 02 ---------------");
        //-1을 입력하기전까지 계속 정수를 받습니다
        // 그리고 입력한 수중의 짝수의합과 홀수의 합을 따로 구해서 출력
        
        
        
        //문제
        //1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	}
	

}
