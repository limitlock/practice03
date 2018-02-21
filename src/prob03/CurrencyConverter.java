package prob03;

public class CurrencyConverter {
	//1,076.20/$1
	
	private static double rate;

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	
	public static double toDollar( double krw ) {
//		return krw CurrencyConverter.rate;
		
		return krw*1/CurrencyConverter.rate;
		
	}
	
	public static double toKRW( double dollar ) {
		return dollar*CurrencyConverter.rate;
	}
	
}
