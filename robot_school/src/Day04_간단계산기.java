import java.util.Scanner;

public class Day04_간단계산기 {

	public static void main(String[] args) {
		//입력수 :  a, b,
		//입력 연산자 : 문자열 op
		//출력 : 2+3 = 5
		
		int a, b;
		String op;
		
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.print("숫자 : ");
			a = sc.nextInt();
			
			if(a==0) {
				System.out.println("끝");
				break;
			}
			
			System.out.print("숫자  : ");
			b = sc.nextInt();
			
			System.out.print("연산자: ");
			op = sc.next();
		
			
			if(op.equals("+"))
				System.out.println(a + op + b + "=" + (a+b));
			else if(op.equals("-"))
				System.out.println(a + op + b + "=" + (a-b));
			else if(op.equals("*"))
				System.out.println(a + op + b + "=" + (a*b));
			else if(op.equals("/"))
				System.out.println(a + op + b + "=" + (a/b));
			else System.out.println("사칙연산이 아닙니다.");
			
			
			//문자열을 문자로 바꾸기 :  "+" 문자열 String ==> '+' 문자 char
			char opp = op.charAt(0);
			switch (opp) {
			case '+':
				System.out.println("더하기 연산"); break;
			case '-':
				System.out.println("빼기 연산"); break;
			case '*':
				System.out.println("곱하기 연산"); break;
			case '/':
				System.out.println("나누기 연산"); break;
			default:
				break;
			}
		
		}
		
		
		
		
	}

}
