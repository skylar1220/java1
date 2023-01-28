
public class Equals {

	public static void main(String[] args) {

		// 원시 데이터 (초기에 나온 애, 소문자로 시작) -> == 씀 
		int p1 = 1;
		int p2 = 1;
		boolean a = p1 == p2;
		System.out.println("a: " + a);

		// 비원시데이터(나중에 나온 애, 대문자로 시작) -> equals 씀
		String o1 = new String("java");
		String o2 = new String("java");
		boolean b = o1 == o2;
		System.out.println("b: " + b);
		
		// 비원시 데이터지만 new를 안쓰면 같은 공간에 넣어서 True가 나
		String o3 = "java2";
		String o4 = "java2";
		boolean c = o3 == o4 ;
		System.out.println("c: "+c);
	}

}
