
public class Day04_반복문3 {

	public static void main(String[] args) {
		System.out.println("문제1===============================");
		//1 2 3
		//1 2 3
		//1 2 3
		for(int i=1; i<= 3; i++) {
			for(int j=1; j<=3; j++) 
				System.out.print(j+" ");
			System.out.println(); 
		} 
		
		
		
		System.out.println("문제2===============================");
		//1 1 1 1
		//2 2 2 2
		//3 3 3 3 
		for(int i=1; i<= 3; i++) {
			for(int j=1; j<=4; j++) 
				System.out.print(i+" ");
			System.out.println(); 
		}
		
		
		
		System.out.println("문제3===============================");
		//1 
		//1 2
		//1 2 3
		//1 2 3 4
		for(int i=1; i<= 4; i++) {
			for(int j=1; j<=i; j++) 
				System.out.print(j + " ");
			System.out.println(); 
		}
		
		
		System.out.println("문제4===============================");
		//4 3 2 1  
		//3 2 1
		//2 1
		//1
		for(int i=4; i>= 1; i--) {
			for(int j=i; j>=1; j--) 
				System.out.print(j + " ");
			System.out.println(); 
		}
		
		
		System.out.println("문제4===============================");
		//* * * *
		//* * *
		//* *
		for(int i=4; i>=2; i--) {
			for(int j=i; j>=1; j--) 
				System.out.print("* ");
			System.out.println(); 
		}
		System.out.println("/./");
		
		for(int i=3; i>=1; i--) {
			for(int j=i+1; j>=1; j--) 
				System.out.print("* ");
			System.out.println(); 
		}	
		
		
		
		
	} 
}