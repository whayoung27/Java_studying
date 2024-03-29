package Ch13;

public class C01PersonMan {

	public static void main(String[] args) {
		 C01Person hong = new C01Person (); //이 객체를 우리는 hong 이라는 이름으로 사용하겠다. hong= 참조변수. 
		 hong.name = "홍길동";
		 hong.age = 35;
		 hong.address = "대구광역시 반월당 파출소";
		 hong.hello();// 소괄호 꼭 ! 소괄호는 함수라는 뜻. n
		 System.out.printf("%s님의 나이는 %d이고 주소는 %s 입니다", hong.name, hong.age, hong.address);
	}

}
