
public class Car {
	Car(){//기본형 이외의 생성자가 선언될때에는 
		System.out.println("부모 car생성자 " );
	}
	
	Car(String name){ //기본형이 반드시 필요하다
		System.out.println("부모 car생성자  기본형" + name);
	}
	
	
	String carname;
	String color = "검정색";
	int velocity;
	
	void speedUp() {
		velocity += 5;
		System.out.println(carname + " 현재속도: " + velocity);
	}
	
	void speedDown() {
		velocity -= 5;
		System.out.println(carname + " 현재속도: " + velocity);
	}
	
	void print() {
		System.out.println(carname + color);
	}
}
