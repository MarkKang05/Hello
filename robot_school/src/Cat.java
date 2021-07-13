
public class Cat extends Animal{
	public static void main(String[] args) {
		//UpCasting : 상위<---하위
//		Cat cat = new Animal();  //불가능
		
		Animal animal = new Cat(); //가능
		animal.name = "mimi";
		animal.print();
		
		
		//DownCating
		
		Cat cat = (Cat)animal;
		cat.print();
		
		cat.name = "주주";
		cat.print();
		animal.print();

		
	}
}
