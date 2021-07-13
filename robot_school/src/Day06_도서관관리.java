import java.util.Scanner;

public class Day06_도서관관리 {

	public static void main(String[] args) {
		Book b1 = new Book("Java 교과서", 10);
		b1.printBookCount();

		Book b2 = new Book("파이썬 기초", 20);
		b2.printBookCount();

		Book b3 = new Book("카메라 사용법", 100);
		b3.printBookCount();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("원하시는 작업을 선택해주세요[1: 대출  2: 반납]: ");
			int job = sc.nextInt();
			if(job==1) {
				System.out.print("원하는 수량: ");
				int count = sc.nextInt();
				b3.rentalBook(count);
			} else {
				System.out.print("반납할 수량: ");
				int count = sc.nextInt();
				b3.returnBook(count);
			}
		
		}
			
//		b3.rentalBook(10);
//		b3.rentalBook(20);
//		
//		b2.returnBook(10);

	}

}
