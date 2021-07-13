import java.util.Scanner;

public class Day03_반복문2 {
	//어떤 N을 입력받아서 
	//N까지의 작수의 합과 홀수의 합을 출력하시오.
	public static void main(String[] args) {
		int N;
		int even_sum = 0, odd_sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		N = sc.nextInt();
		
		for(int i = 1; i<=N;i++)
			if(i%2 == 0) even_sum += i;
			else odd_sum += i;
		
		System.out.println("1부터 10까지의 짝수 합은 "+ even_sum+"이고 " + "홀수 합은 "+odd_sum+"입니다.");
	}

}
