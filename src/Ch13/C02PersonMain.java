package Ch13;


class C02Person {
	String name; //참조변수 . string. int는 아님. 
	int age; 
	String addr;
	
}
public class C02PersonMain {

	public static void main(String[] args) {
		C02Person hong = new C02Person (); /// hong 참조변수	
		hong.name = "홍길동";
		hong.age = 55;
		hong.addr= "대구대구대구";
		
		System.out.printf("%s %d %s\n",hong.name , hong.age, hong.addr);

	}

}


