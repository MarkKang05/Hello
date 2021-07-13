
public class Phone {

	Phone(){
		total++;
	}

	Phone(String model, int price){
		this();
		this.model = model;
		this.price = price;
	}

	String model;
	int price;
	static int total;
	
	void toPrint() {
//		return this.price +"만원짜리 " +this.model+"스마트폰";
		System.out.println(this.price +"만원짜리 " +this.model+"스마트폰");
	}
	
	void printTotal() {
		System.out.println("핸드폰 총 개수: " + total);
	}
	
	
	
}
