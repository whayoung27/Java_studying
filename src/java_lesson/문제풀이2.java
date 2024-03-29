package java_lesson;
import java.util.Scanner;


public class 문제풀이2 {

	public static void main(String[] args) {
	
		
		//문제 
      //  System.out.println("--------------- while - if문 문제 01 ---------------");
        //입력한 1부터 입력 수 중(x)에 3의 배수의 합을 출력
        
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
// 
//        
//        int i = 1;
//        int sum = 0;
//        
//        while ( i <= num ) {
//        	if (i%3 == 0 ) {
//        		sum += i; 
//        	}
//        	i++;
//        }
//
//          
//          System.out.println("1부터 " + num + "까지의 수중에서 3의 배수의 총합 : " + sum);
//        
      
        
        
        
        //문제 
       // System.out.println("--------------- while - if문 문제 02 ---------------");
        //-1을 입력하기전까지 계속 정수를 받습니다
        // 그리고 입력한 수 중의 짝수의합과 홀수의 합을 따로 구해서 출력
        

		//**다시풀어보기 **//

//	Scanner sc = new Scanner(System.in);
	
	//헷갈리는 부분 : 문제에서의 변수설정, 문제이해.  ex정수를 받는다는게 연속적으로 받는다는건지. 
	//원리 x 문제에 변수 설정 대입이어려움. // 탈출 필요 i++; 라고 머릿속에 박혀있어서 헷갈. 
//	
//	int odd_sum = 0;
//	int even_sum = 0;
//	
//	while (true) {
//		System.out.println("정수를 입력하세요 . -1 입력시 종료");
//		int num = sc.nextInt();
//		
//		if (num == -1) {
//			break;
//		} 
//		if (num%2 ==0 ) {
//			even_sum += num ; 
//		} else { odd_sum += num;
//		}
//		
//	
//			
//	}
//	System.out.println("입력한 짝수들의 합 :" + even_sum);
//	System.out.println("입력한 홀수들의 합 :" + odd_sum);
//		
    	 

        
       
		
		
		//문제
	    //1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다
		
	
		
		

//	int i = 1; 
//	int multipleThreefour= 0;
//	
//	
//	
//	while ( i<= 100 ) {
//		
//		if ( (i%3==0) && (i%4==0) ) {
//			multipleThreefour= i;
//			System.out.println("1부터 100까지 수중에 3의배수이면서 4의 배수인것 " + multipleThreefour );
//			
//		} 
//		i++;
//
//		}
		
		
		//구구단 2단 출력 
//		
//		int dan = 1;
//		
//		while (dan <= 9 ) {
//			System.out.printf("2 * %d = %d\n" , dan, dan* 2); 
//			 dan++;
//		}
		
		
		
		// 문제
				// 구구단 N단 출력
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		System.out.println("구구단"+n+"단을 출력합니다.");
//		
//		int i =1;
//		
//		while (i<=9) {
//			System.out.printf("%d * %d = %d\n",n ,i , n*i);
//			i++;
//		
//		}
//		
		

				// 2단 역순 출력
//				
//		
//		int dan = 9;
//		
//		while (0<dan ) {
//			System.out.printf("%d * %d = %d \n", 2,dan, 2*dan );
//			dan--;
//			
//		}
		

		// 문제
		// 구구단 2단부터 9단까지 출력
//		
		
//		int dan = 2;
//		
//		while(dan<=9) {
//			System.out.println(dan + "단");
//			int i = 1;  //곱해지는 수 초기화
//			
//			
//			while(i<=9) {
//				System.out.printf("%d * %d = %d\n", dan, i , dan*i);
//				
//				i++;
//			}dan ++;
			
		
		// N부터 9단까지 전체 출력 
			
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		
//		
//		while (n<=9) {
//			int i = 1;
//			System.out.println(n+"단");
//			while(i<=9) {
//			System.out.printf("%d * %d = %d\n",n,i, n*i  );
//			i++;
//			
//		}n++;
//		
//	}
	
		

		// 1
		//*****
		//*****
		//*****
		//*****
		
//		int i = 1;
//		
//		
//		while(i<=4) {
//			int byul = 1;
//			while(byul<=5) {
//			System.out.print("*");
//			byul++;
//			} 
//			
//			i++;
//			System.out.println();
//		}
		
		
		//높이 : n
		//*****
		//*****
		//*****
		//*****
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("별을 쌓을 높이갯수를 입력하세요");
//		int n = sc.nextInt();
//		
//		int i = 1;
//		
//		while (i <= n) {
//			int byul = 1;
//			while(byul<=5) {
//				System.out.print("*");
//				byul++;
//			}
//			
//			
//			
//		i++;
//		System.out.println();
//		}
		
		
		
		//2
		//*
		//**
		//***
		//****
		
//		int i = 1;
//		
//		while(i<=4) {
//			int byul = 1;
//			while(byul<=i) { //여기서 i 말고 4는 안되나?//반복횟수
//				System.out.print("*");
//				byul ++;
//			}
//			i++;
//			System.out.println();
//		}
//		

		
		
		
		
		//3// 질문. 
		//****
		//***
		//**
		//*
		
//		int i =1 ; 
//		
//		while (i<=4) {
//			int byul = 4;
//			while(byul>=i) 
//				System.out.print("*");
//				byul--;
//				
//			}i++;
//			System.out.println();
//			
//			
//		}
		
		
		//**다시 풀어보기
		//****
		//***
		//**
		//*
		
//		int i =1; 
//		while (i <=4) {
//			int byul = 1; 
//			while(byul <= 5-i ) { 
//				
//				System.out.print("*");			
//				byul++;
//			}
//		
//			
//		}
		
		
//		줄의 반복을 담당하는 변수는 i입니다! i가 1씩 증가할때 별의 반복이 줄어야합니다 그러므로 어떤 수에서 i를 빼야한다는 사실은 확정이겠죠!  
//		결론 : [어떤 수 - i ]
//
//		 일단 첫번째 줄(i = 1일때)에서 별의 변수가 증가하면서 4번 반복을 이뤄야합니다
//		따라서 byul <= 5-i 이렇게 되어야합니다 
		
//		
		
		
		//4  //질문
		//   *
		//  ***
		// *****
		//*******
		
		
		
		for(int i =1;i<=4;i++) {
			for(int space =1; space<=4-i;space++) {
				System.out.print(" ");	
			}
			for(int star = 1; star <= 2*i-1 ;star++) {
				System.out.print("*");
				
			}System.out.println();
		}
		
		
		
		
		
		
//		int i = 1;			//의미 부여 하면 안됨... i 가 0이 되면 i < = 3 이어야함. 
//		
//		while(i<=4) {
//			int space =3; 
//			while(space>=i) {			//다시보기 
//				System.out.print(" ");
//				space--;
//			}
//			int byul = 1; 
//			while(byul<=i*2-1) {  // 조건식은 반복횟수를 정하기위한 범위. 반복수, 별의 갯수와는 상관 x 몇번반복을 할건지에 대한 수 . 
//			
//				System.out.printf("*");
//				byul++;
//				
//			}i++;
//			System.out.println();
//				
//			}
//			
		
					
		
		
	
	}
	
}


		
		
		

	
        
	
		

	
	
	 
    
