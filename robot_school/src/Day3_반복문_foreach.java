
public class Day3_반복문_foreach {

	public static void main(String[] args) {
		int a[] = new int[] {1,2,3,4,5};
		
//		for(int i = 0; i< a.length;i++)
//			System.out.println(a[i);
		
		for (int i: a)
			System.out.println(i);
		
		float b [] = new float[] {2.1f, 3.3f, 4.1f};
		float sum = 0;
		for (float val : b) {
			System.out.println(val);
			sum = sum + val;
		}
		System.out.println("SUM: "+ sum);
		
		String []c = {"Seoul", "Robot", "High", "School"};
		for (String str : c) {
			str = "ttt"; //c배열을 직접 건들지 않음. c의 값이 안바뀜
			System.out.println(str);
		}
		
		for(String str : c)
			System.out.println(str);
		

	}

}
