
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]) ;
		double varRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * varRate;
		double Total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		


		double[] dividendRates = new double[3]; 
		// double형 데이터로 이루어진 배열 의미        // double형 데이터 3개를 담을 수 있는 수납 상자
		dividendRates[0] = 0.5 ;
		dividendRates[1] = 0.3 ;
		dividendRates[2] = 0.2 ; 
		
		double dividend1 = income * dividendRates[0] ;
		double dividend2 = income * dividendRates[1] ;
		double dividend3 = income * dividendRates[2] ;

		
		System.out.println( "Value of supply : " + valueOfSupply );
		System.out.println( "VAT : " + vat );
		System.out.println( "Total : " + Total );
		System.out.println( "Expense : " + expense );
		System.out.println( "Income : " + income );
		System.out.println( "Dividend 1 : " +  dividend1  );
		System.out.println( "Dividend 2 : " +  dividend2  );
		System.out.println( "Dividend 3 : " +  dividend3  );




	}

}
