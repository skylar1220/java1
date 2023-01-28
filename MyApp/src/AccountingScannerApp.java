import java.util.Scanner;

class Accounting1 {
	public  double valueOfSupply;
	public  double vatRate;
	public  double expenseRate;
	

	public  void print() {
		System.out.println( "Value of supply : " + valueOfSupply );
		System.out.println( "VAT : " + getVAT() );
		System.out.println( "Total : " + getTotal() );
		System.out.println( "Expense : " + getExpense() );
		System.out.println( "Income : " + getIncome() );
		System.out.println( "Dividend 1 : " +  getDividend1()  );
		System.out.println( "Dividend 2 : " +  getDividend2()  );
		System.out.println( "Dividend 3 : " +  getDividend3()  );
	}

	public  double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public  double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public  double getDividend3() {
		return getIncome() * 0.2;
	}
	
	public  double getIncome() {
		return valueOfSupply - getExpense() ;
	}

	public  double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public  double getTotal() {
		return valueOfSupply + getVAT();
	}

	public  double getVAT() {
		return valueOfSupply * vatRate;
	}

}

// instance = 이걸 이용하려면  public 뒤 'static'은 없애야

public class AccountingScannerApp {


	public static void main(String[] args) {
		
		Scanner in = new Scanner( System.in ) ;

		System.out.print( "물건의 공급가를 입력해주세요: " );
		double inVal = in.nextDouble() ;
		
		System.out.print( "부가세율을 입력해주세요 (기본:0.1): " );
		double inVat = in.nextDouble() ;
		
		System.out.print( "물건 생산에 소요되는 비용의 비율을 입력해주세요 (기본:0.3): ");
		double inExpense = in.nextDouble() ;
			
		Accounting1 a1 = new Accounting1() ;
		a1.valueOfSupply = inVal ;
		a1.vatRate =inVat ;
		a1.expenseRate = inExpense ;
		
		a1.print() ;
		

	}

}


