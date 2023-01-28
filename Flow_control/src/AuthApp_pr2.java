import java.util.Scanner;

public class AuthApp_pr2 {

	public static void main(String[] args) {
		String[][] users = { { "karina", "1111" }, { "winter", "2222" }, { "ning", "3333" } };

		// users 입력 받기
		Scanner in = new Scanner(System.in);

		System.out.print("Id?: ");
		String inputId = in.next();

		System.out.print("Password?: ");
		String inputPw = in.next();


		// users, 비밀번호 맞는지 반복문, 조건문
		boolean isRightId = false;
		boolean isRightPw = false;

		for (int i = 0; i < users.length; i++) {
			String[] current = users[i];

			boolean isId = inputId.equals(current[0]);
			boolean isPw = inputPw.equals(current[1]);

			if (isId && isPw) {
				isRightId = true;
				isRightPw = true;
				break;
			} else if (isId) {
				isRightId = true;
			} 
		}

		if ( isRightId && isRightPw ) {
			System.out.println("Welcome! " + inputId);
		} else if ( isRightId ) {
			System.out.println("WRONG PW!!");
		} else {
			System.out.println("WRONG ID!!");
		}

	}

}

//aespa  이름, 1111 비밀번호 {}, {}, {} , {} 배열 저장해놓고
//이름, 비밀번호 각각 확인하는 
//확인할 때 배열 속 배열로 각각 확인하기