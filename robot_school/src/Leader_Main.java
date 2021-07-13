
public class Leader_Main {

	public static void main(String[] args) {
		Leader leader1 = new Leader("홍길동","20501",  true);
		leader1.isLeader();
		
		Leader leader2 = new Leader("강민상","20501",  false);
		leader2.isLeader();
		
		leader1.printStudent();
		leader2.printStudent();

	}

}
