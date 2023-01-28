
public class ArrayApp {

	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "karina";
		users[1] = "winter";
		users[2] = "gizell";
		// 0은 index(색인), karina 는 element(원소)

		System.out.println(users[2]);
		System.out.println(users.length);

		int[] scores = { 10, 100, 1000 };
		System.out.println(scores[1]);
		System.out.println(scores.length);

		String[] bp = { "jisoo", "lisa", "rose" };
		System.out.println( bp[2] );

	}

}
