import java.util.Scanner;

public class AuthApp {

	public static void main(String[] args) {
		
		String id = "hyun" ;
		
		Scanner in = new Scanner (System.in) ;
		System.out.print("Id?: ");
		String inputId = in.next() ;
		
		
		String pass = "1111" ;
		System.out.print("password?: ");
		String inputPass = in.next() ;
		
		
		if ( inputId.equals(id) && inputPass.equals(pass)  ) {
			System.out.println("Hi! " + inputId );
		} else {
			System.out.println("WRONG ID or PASSWORD!");
		}
		
		
				
		// if (inputId == id) --> 이거 안됨.
		// 대신 if ( inputId.equals(id) ) 
		
		// 이렇게 여러번 중첩말고 위 처럼 하
//		if ( inputId.equals(id) ) {
//
//			if ( inputPass.equals(pass) ) {
//			} else {
//				System.out.println("WRONG PASSWORD!");
//			}
//		} 
		
		
		
	}

}
