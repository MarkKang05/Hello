
public class ShoppingMall {
	String code;
	static int total;
	ShoppingMall(){}
	ShoppingMall(String code){
		this.code = code;
	}
	
	void addTotal(int Quantity) {
		this.total += Quantity;
		System.out.println("재고를 더합니다. 남은 재고: " + this.total);
	}
	
	void subTotal(int Quantity) {
		this.total -= Quantity;
		System.out.println("재고를 뺍니다. 남은 재고: " + this.total);
	}
	
	public static void main(String[] args) {
		ShoppingMall sp = new ShoppingMall();
		sp.code =  "111";
		sp.addTotal(1);
		
		
		ShoppingMall sp2 = new ShoppingMall();
		sp2.code =  "221";
		sp2.subTotal(1);

	
	}
}
