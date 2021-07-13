
public class PhoneMain {

	public static void main(String[] args) {
		Phone galaxy = new Phone();
		galaxy.model = "s21";
		galaxy.price = 2000;
		
		Phone iphone = new Phone();
		iphone.model = "iphone12";
		iphone.price = 2220;
	
		Phone lg = new Phone("v50", 1234);
		
//		System.out.println(s21.toPrint());
		galaxy.toPrint();
		iphone.toPrint();
		lg.toPrint();
		lg.printTotal();
	}

}
