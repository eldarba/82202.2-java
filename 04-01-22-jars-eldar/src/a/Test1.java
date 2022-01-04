package a;

import api.converters.currency.CurrencyConverter;
import api.converters.temperature.TemperatureConverter;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("start test");

		double nis = 100;
		double dollar = CurrencyConverter.convertNISToDollar(nis);
		System.out.println(dollar);
		// to print in a formatted style
		System.out.format("%.2f nis are %.2f $\n", nis, dollar);

		double celsius = 8;
		double farenheit = TemperatureConverter.convertCelsiusToFahrenheit(celsius);
		System.out.println(celsius + " celsius is " + farenheit + " farenheit");

		// to print in a formatted style
		System.out.format("dollars: %.2f", dollar);

	}

}
