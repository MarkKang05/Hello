
public class TV_shopping extends ShoppingMall{
	
	String time;
	
	TV_shopping(String code, int total, String time){
		super(code);
		this.code = code;
		this.time = time;
		addTotal(total);
	}

	public static void main(String[] args) {
		TV_shopping tv = new TV_shopping("ABC123", 3, "3:00");
		
		
	}

}
