package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double dollarPrice, double qtyDollar ) {
		return dollarPrice * qtyDollar * (1.0 + IOF);
	}

}
