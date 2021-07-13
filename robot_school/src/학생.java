
public class 학생 {
	//생성자
	학생(){
		count++;
	}
	
	static int count = 0;
	static String School = "RobotGo";
	String name;
	int grade;
	
	void print() {
		System.out.println(count + "번째 학생 "+School + name+":"+ grade + "학년");
	}

	
}
