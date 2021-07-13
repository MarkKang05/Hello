
public class Day06_스테틱변수연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		학생 a = new 학생();
		a.grade = 1; a.name="홍길동" ;
		a.print();

		학생 b = new 학생();
		b.grade = 2; b.name="어쩌고" ;
		b.School = "서울고";
		b.print();

		학생 c = new 학생();
		c.grade = 3; c.name="저쩌고" ;
		c.School = "서울여고";
		c.print();

	}

}
