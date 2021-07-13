
public class Truck extends Car{
	Truck(){
		System.out.println("자식 car생성자 ");
	}
	Truck(String name){
		System.out.println("자식 car생성자 "+name);
	}
	
	int ton;
	
	void print(){ //부모의 메소드를 재정의 해서 사용 : 오버라이딩
		System.out.println(carname+color+":"+ton+"톤");
	}
	public static void main(String[] args) {
		Truck bongo = new Truck("bongo");
	}
}
