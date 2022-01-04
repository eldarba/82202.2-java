package api.converters.temperature;

public class TemperatureConverter {

	/*
	 * To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 (or
	 * 9/5) and add 32.
	 */
	public static double convertCelsiusToFahrenheit(double celsius) {
		double fahrenheit = celsius * 1.8 + 32;
		return fahrenheit;
	}

	/*
	 * To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and
	 * multiply by .5556 (or 5/9).
	 */
	public static double convertFahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 0.5556;
		return celsius;
	}

}
