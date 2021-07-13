
public class Animal {
	
	Animal(){}
	//constructor---------------------------------------------------
	Animal(String kind, String name, int age, String toy){
		this(kind, name, age);
		System.out.println(name + toy + "를 좋아합니다.");
		System.out.println(name + toy + "를 좋아합니다.");
		System.out.println(name + toy + "를 좋아합니다.");
	}

	Animal(String kind, String name, int age){
		this.kind = kind;
		this.name = name;
		this.age = age;
		count++;
	}
	
	//member variable---------------------------------------------------
	String kind; //dog, cat ...
	String name; // name
	private int age;
	private String toy;
	private static int count;

	//method---------------------------------------------------
	static void printCount() {
		System.out.println("현재 총 " + count + "마리가 있습니다.");
//		System.out.println(name); error// The method getToy() is undefined for the type Animal
	}
	void print(String name, int age) {
		System.out.println(name + age);
	}

	void print() {
		System.out.println("이 동물의 이름은 "+this.name);
	}
	void print(String name) {
		System.out.println(kind + name + age);
	}
	
	//private 변수를 사용할 수 있는 통로가 되는 메소드
	// set : 어떤 값을 지정할때 
	// get : 어떤 값을 불러올때 
	
	void setToy(String toy) {
		this.toy = toy;
	}
	
	String getToy() {
		return toy;
	}
	
	//동물의 나이를 저장하는 메소드
	void setAge(int age) {
		this.age = age;
	}
	
	//동물의 나이를 알려주는 메소드
	int getAge() {
		return this.age;
	}



}
