
public class Leader extends 학생정보{

	boolean leader = false;	

	Leader(String name, String hakbun, boolean leader){
		this.name = name;
		this.hakbun = hakbun;
		this.leader = leader;
	}
	
	boolean isLeader() {
		printStudent();
		if(this.leader==true) {
			System.out.println(name+"는 리더입니다");
		}
		else {
			System.out.println(name+ "는 리더가 아닙니다");
		}
		return this.leader;
	}
}
