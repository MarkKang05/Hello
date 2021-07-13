
public class 학생정보 {
	학생정보(){}      //생략가능
	학생정보(String hakbun , String name, int age, String phone){
        this.hakbun = hakbun;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
	
	
	
	//속성
	String hakbun;
	String name;
	int age;
	String phone;


	//메소드
	protected void printStudent() {
		System.out.println(name + "," + hakbun + "," + phone);
	}
}
