import java.util.Scanner;

public class AuthApp_pr1 {

	public static void main(String[] args) {
		String[][] users = { { "karina", "1111" }, { "winter", "2222" }, { "ning", "3333" } };

		// users 입력 받기
		Scanner in = new Scanner(System.in);

		System.out.print("Your name?: ");
		String inputId = in.next();

		System.out.print("Password?: ");
		String inputPw = in.next();

		// users, 비밀번호 맞는지 반복문, 조건문
		boolean isLogined = false ; // @@: 유저 맞는지 확인하는 boolean 변수 만들
		for (int i = 0; i < users.length; i++) {
			String[] current = users[i]; // @@ : current 라는 배열을 하나 만들어서 거기에 { "karina", "1111" } 넣기 
			if ( inputId.equals(current[0]) ) {
				isLogined = true ; 
				break;
			}
		}
		if ( isLogined ) {
			System.out.println("Welcome! " + inputId ) ;
		} else {
			System.out.println( "WRONG USER!! ");
		}

	}

}

//aespa  이름, 1111 비밀번호 {}, {}, {} , {} 배열 저장해놓고
//이름, 비밀번호 각각 확인하는 
//확인할 때 배열 속 배열로 각각 확인하기