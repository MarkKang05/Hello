
public class Book {
	//생성자
	Book(String name, int count){
		bookName = name;
		this.count = count;
	}
	
	//멤버변수
	String bookName;
	private int count;
	
	//메소드
	//지금 등록한 책의 이름과 재고량을 출력하는 메소드
	void printBookCount() {
		System.out.println(bookName +" : " + count + "권");
	}
	
	//책을 대출하는 메소드
	void rentalBook(int count) {
		if(count > this.count) {
			System.out.println(bookName +" 재고량이 부족합니다. 현재재고량: "+ this.count);
		}
		else {
			this.count = this.count - count;
			System.out.println(bookName+ " : "+ count +"권 대출");
			printBookCount();
		}
	}
	//책을 반납하는 메소드
	void returnBook(int count) {
		this.count = this.count + count;
		System.out.println(bookName + " : "+count+ "권 반납");
		printBookCount();
		
	}

}
