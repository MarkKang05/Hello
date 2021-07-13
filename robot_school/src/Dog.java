
public class Dog {
	String bread;
	int age;
	String color;

	Dog(String bread, int age, String color){
		this.bread = bread;
		this.age = age;
		this.color = color;
	}
	
	Dog(){}
	
	void barking() {
		System.out.println(bread+"가 짖습니다. 멍멍!");
	}
	
	void hungry() {
		System.out.println(bread+"가 배고픕니다.");
	}
	
	void sleeping() {
		System.out.println(bread+"가 졸립니다.");
	}
	
	String toPrint(String bread, int age, String color) {
		String str = "("+bread+":"+age+":"+color+")";
		return str;
	}
}
