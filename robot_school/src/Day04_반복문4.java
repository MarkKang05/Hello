import java.util.Scanner;

public class Day04_반복문4 {
	public static void main(String[] args) {
		//입력받은 수 N
		//1부터 N까지의 합을 구하되 
		//홀수는 더하고 짝수는 빼자
		//+1-2+3-4=?
		int i=1, sum=0;
		int N;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		N = sc.nextInt();
		
		while(i<=N) {
			if(i%2==0) {
				System.out.print("-"+i);
				sum-=i;
			}
			else {
				System.out.print("+"+i);
				sum+=i;
			}
			i++;
		}
		System.out.println("="+ sum);
	}
}
