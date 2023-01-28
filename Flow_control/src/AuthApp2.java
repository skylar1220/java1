import java.util.Scanner;

public class AuthApp2 {

	public static void main(String[] args) {
		
		String id = "hyun" ;
		
		Scanner in = new Scanner (System.in) ;
		System.out.print("Id?: ");
		String inputId = in.next() ;
		
		
		
		String pass = "1111" ;
		String pass2 = "2222" ;

		System.out.print("password?: ");
		String inputPass = in.next() ;
		System.out.print("2nd password?: ");
		String inputPass2 = in.next() ;
		
		
		boolean isRightPass = ( inputPass.equals(pass) || inputPass2.equals(pass2) )  ; // 변수 만들면 간단해짐
		if ( inputId.equals(id) &&  isRightPass ) { 
			System.out.println("Hi! " + inputId );
		} else {
			System.out.println("WRONG ID or PASSWORD!");
		}
		
		
			
		// 이렇게 여러번 중첩말고 위 처럼 하기
//		if ( inputId.equals(id) ) {
//
//			if ( inputPass.equals(pass) ) {
//			} else {
//				System.out.println("WRONG PASSWORD!");
//			}
//		} 
		
		
		
	}

}
