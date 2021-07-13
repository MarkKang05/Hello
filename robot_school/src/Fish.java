
public class Fish extends Animal{
	
	void swim() {
		System.out.println(name + "가 헤엄칩니다");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish myfish = new Fish();
		myfish.name = "니모";
		myfish.kind = "흰동가리";
		myfish.setAge(3);

		myfish.swim();
	}

}
