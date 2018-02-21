package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		// 환율을 세팅 합니다.

		CurrencyConverter cc = new CurrencyConverter();

		cc.setRate(1076);
		
		
		System.out.println("백만원은 " + cc.toDollar(1000000) + "달러 입니다.");
		System.out.println("백달러는 " + cc.toKRW(100) + "원 입니다.");

	}

}
