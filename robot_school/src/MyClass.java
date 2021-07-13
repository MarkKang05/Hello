
class Father{
	String name;

//	Father(){}
	Father(String name){
		this.name = name;
		System.out.println("Fahter Constructor " + this.name);
	}
	
}

public class MyClass extends Father{
	
	MyClass(String name){
		super(name);
		System.out.println("MyClass Constructor " + super.name);
	}
	
	public static void main(String[] args) {

		MyClass a = new MyClass("myclass_name");
	}

}
