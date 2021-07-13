
public class AllCarMain {

	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.carname = "mySonata";
		sonata.color = "하얀색";
		sonata.velocity = 30;
		
		sonata.speedUp();
		sonata.speedDown();
	
		sonata.print();
		//========================
		//Car 상속받은 Truck에 관한 소스
		Truck t1 = new Truck();
		t1.carname = "포터";
		t1.speedUp();
		t1.speedDown();
		
		t1.print();
		t1.ton = 3;
		t1.print();
		
		//========================
		//Taxi
		Taxi kakaoTaxi = new Taxi();
		kakaoTaxi.carname = "카카오택시";
		kakaoTaxi.color = "노란색";
		kakaoTaxi.speedUp();
		kakaoTaxi.speedUp();
		kakaoTaxi.payUp();
		

	}

}
