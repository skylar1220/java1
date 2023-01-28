import java.util.Scanner;

public class AuthApp3 {

	public static void main(String[] args) {

		String[][] users = { 
				{"karina", "1111" },
				{"winter", "2222" },
				{"ning", "3333" }
		} ;
		
	
		System.out.print("Your name?: ");
		Scanner in = new Scanner(System.in) ; 
		String inputId = in.next() ;
		
		System.out.print("Password?: ");
		String inputPass = in.next() ;
		
		boolean isLogined = false;
		for ( int i = 0 ; i < users.length ; i++ ) {
			String [] current = users[i] ;
			if (
					current[0].equals(inputId) &&
					current[1].equals(inputPass) 
					) {
				isLogined = true ; 
				break ; 
			}
		}
		if ( isLogined ) {
			System.out.println("Hi! " + inputId );
		} else {
			System.out.println("WRONG USER or PASSWORD!!");
		}
		
	}

}


