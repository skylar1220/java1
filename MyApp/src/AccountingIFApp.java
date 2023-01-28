

public class AccountingIFApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double varRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * varRate;
		double Total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;

		double dividend1;
		double dividend2;
		double dividend3;

		if (income > 10000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}

		
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

// 만원보다 적을 때는 divi 1이 다 가져가고 아닌경우는 원래대로 나