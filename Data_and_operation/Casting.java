
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;

		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e);

		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f);
		System.out.println(f.getClass()); // 앞에 f의 데이터 타입을 알려줌 = getClass

	}

}


//- Casting : 데이터 타입의 변환
//정수를 실수로 변환할땐 손실이 없으니까 그냥 적어도 무방 double a = (double) 1;
//실수를 정수로 변환할 때 = 손실이 생길 수 있으므로 int e = (int) 1.1; 이런식으로 해줘야함
//- 주의점 : 데이터 손실이 있을 경우 Err 발생함 (ex : 실수 -> 정수)
//문자로 변환할 때 = String f = Integer.toString(1); 
//f.getClass() = 데이터 타입을 알려줌