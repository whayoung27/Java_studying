package java_lesson;
import java.util.Scanner;


public class Ch12 {

	public static void main(String[] args) {
		
//		
//		System.out.println("===for 문 예제 1===");
//		
//		System.out.println("===while 문 ==");
//		
//		int i = 0; //초기값 
//		while(i <= 10) {
//			System.out.println("i = " + 1);
//			i++;
//			
//		}
//		System.out.println();
//
//		System.out.println("===for 문 ===");
//		for (int j = 0; j < 11; j++) {
//			System.out.println("i = "+j);
//		}
		
//System.out.println("-------------------------------- for문 - 예제01 --------------------------------------");
//		
//		System.out.println("-------------------------------- while문 --------------------------------------");
//		int i =0; // 초기값
//		while(i <= 10) {
//			System.out.println("i = " + i);
//			i++;		// 증감연산
//			
//		}
//		System.out.println();
//		
//		
//		System.out.println("-------------------------------- for문 --------------------------------------");
//		for (int j = 0; j < 11; j++) {
//			System.out.println("i = " + j);
//			
//		}
		System.out.println("--------------- for문 - 예제02 ---------------");
        //1부터 10까지 합


		//while문 
//		int i = 1;
//		int sum = 0; 
//		
//		while (i<=10) { 
//			sum += i; 
//			i++; 
//			
//			
//		}System.out.println("1부터 10까지의 합: " + sum);
//		
		//for문
		
//		int sum = 0; 
//		
//		for (int i = 1; i<=10 ; i++) {
//			sum += i; 
//			
//		}System.out.println("1부터 10까지의 합 : "+ sum);
		
	
		
		
		
		
		 // 문제 01
        System.out.println("--------------- for문 - 문제 01 ---------------");
     // 1부터 N까지의 수의 합을 출력 (N은 사용자로부터 입력받는다)
     // for문으로 만들어보아요 :)
		
//       
//       Scanner sc = new Scanner (System.in);
//        
//       int n = sc.nextInt();
//       
//       int sum = 0; 
//       
//       for (int i = 1; i<=n ; i++ )
//       {sum += i ;
//    	   
//       } System.out.println("1부터 "+n+ "까지의 합은 ?" + sum);
       
        
        
        
        
        // 문제 02
        System.out.println("--------------- for문 - 문제 02 ---------------");
     // 2단부터 9단까지 출력(for문으로 작성)
        
        
        
//        
//        for (int i = 1; i<=9 ; i++) {
//        	System.out.println(i+"단");
//        	for(int dan  = 1; dan<=9; dan++) {
//        		System.out.printf("%d * %d = %d\n", i, dan , i*dan); 
//        	
//        	}
//        	
//        	
//        }System.out.println();
//        
//        

        
      //N부터 M까지 합
//       
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int sum = 0; 
//        
//        for(int i =n; i<=m; i++ ) {
//        	sum += i;
//        	
//        
//        }System.out.printf("%d 부터 %d까지의 합 : %d\n", n , m , sum);
//       
        
        
        //구구단 N단
        
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        
//        for (int i =1; i<=9; i++) {
//        	System.out.printf("%d * %d = %d \n",n ,i , n*i);
//        }
        
        
        
      //구구단 전체
        
//        
//        for (int dan = 1; dan<=9 ; dan++) {
//        	System.out.println(dan+"단");
//        	
//        	for(int i =1; i<=9 ; i ++) {
//        		System.out.printf("%d * %d = %d\n", dan, i ,i*dan);
//        		
//        	}
//       
//        	
//        }	
        
        
        
     // 숫자 차이 2 라면 2n -무슨수뺴기 ( i 가 되려면 ) 몇을 뺴야하는지 . 식으로 . (증산)
        //감산 을 할때 . 1234. 1234. 이므로 시작점이 똑같기 때문에 ... 문제 3번에서 . 
        
      //별찍기
		
		
  		//1
  		//*****
  		//*****
  		//*****
  		//*****
//        
//        for (int i = 1; i<=4 ; i++) {
//        	
//    
//        	for(int byul = 1; byul<=5; byul++) {
//        		System.out.print("*");
//        	}
//        	System.out.println();
//        	
//        }
        
        
		
    	//2
  		//*
  		//**
  		//***
  		//****
        
        
        
//        for (int i =1; i<=4; i++) {
//        	for(int byul=1 ; byul<=i; byul++ ) {
//        		System.out.printf("*");
//        	}System.out.println();
//        	
//        	
//        }
         
      //3
        
  		//****
  		//***
  		//**
  		//*
//        
        
//        
//        for(int i =1; i<=4;i++) {
//        	
//        	for(int byul =4;byul>=5-i ;byul--)
//        	
//        	
//        }
//        
//        
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        for (int i = 1; i<=4; i++) {
//        	for(int byul = 1; byul<=5-i;byul++ ) {
//        		System.out.print("*");
//        	}System.out.println();
//        	
//        }
        
        
      //4 **공백 다시 풀어보기 . 
  		//   *
  		//  ***
  		// *****
  		//*******

        
//        for (int i =1; i<=4; i++) {
//        	for(int space =3; space>=i; space--) {
//        		System.out.print(" ");   
//        	}
//        		
//        	for(int byul = 1; byul<= 2*i-1;byul++ ) {
//            		System.out.print("*");
//        	}
//        	System.out.println();
//
//        	
//    		
//        	
//        }
        	
        
        
        
        
        
        
      //5
  		//*******
  		// *****
  		//  ***
  		//   *
//        
       
//        	
//        
//        1 7   1	0
//        2 5   2	1
//        3 3	3	2
//        4 1	4	3
        // 숫자 차이 2 라면 2n -무슨수뺴기 ( i 가 되려면 ) 몇을 뺴야하는지 . 식으로 . (증산)
        //감산 을 할때 . 1234. 1234. 이므로 시작점이 똑같기 때문에 ... 문제 3번에서 . 
        
        
//        for (int i =1; i<=4; i++) {
//        	for(int space = 1; space <= i-1; space++) {
//        		System.out.print(" ");
//        	}
//        	for(int star = 1; star<= 9-2*i; star++) { 
//        		System.out.print("*");
//        		
//        	}System.out.println();
//        }
//        
        
        
        
        
        
        
        
      //다시풀어보기 **   별 갯수 xx 몇번 반복하는지가 . 중요 . 조건식에 별이 몇번 반복 되어야지 ? 라고 생각해야된다 . 의미부여 xxxx. 
        
//        for (int i = 1; i<=4; i++) {
//        	
//        	for(int space = 1; space<=i-1 ; space++ ) {
//        		System.out.print(" ");
//        		
//        		
//        	}
//        	for( int byul =7; byul >= 2*i-1; byul-- ) {
//        		
//        	 System.out.print("*");
//        		
//        	}System.out.println();
//        	
//        	
//        	
//        }
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        	
//        }

        
        
    	//6
  		//   *
  		//  ***
  		// *****
  		//*******
  		// *****
  		//  ***
  		//   *
      
        
        for (int i  = 1; i<=4; i++) {
        	for(int space = 1; space <=4-i ; space++) {
        		System.out.print(" ");
        		
        	}
        	for (int star = 1; star<=2*i-1 ;star++) {
        		System.out.print("*");
        		
        	}System.out.println();
        	
        }
        
        for (int i2= 1; i2<=3; i2++) {
        	for(int space2=1; space2<=i2; space2++) {
        		System.out.print(" ");
        	}
        	for (int star2 =1; star2<=7-2*i2; star2++) {
        		System.out.print("*");
        	}System.out.println();
        }
        
	
	}

}
