
public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog(); 
		dog1.bread = "강아지";
		dog1.age = 5;
		dog1.color = "white";
		dog1.barking();
		dog1.sleeping();
		
		Dog dog2 = new Dog("핫도그", 3, "black");
		dog2.hungry();
		
		String str = dog1.toPrint("푸들", 7, "brown");
		System.out.println(str);
		
	}
}
