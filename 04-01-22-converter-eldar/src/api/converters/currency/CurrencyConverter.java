package api.converters.currency;

public class CurrencyConverter {

	public static double convertDollarToNIS(double dollar) {
		double nis = dollar * 3.09;
		return nis;
	}

	public static double convertNISToDollar(double nis) {
		double dollar = nis / 3.09;
		return dollar;
	}

}
