package a;

public class Calculator {

	public int div(int a, int b) throws Exception  {
		if (b != 0) {
			// return - all is good
			return a / b;
		}else {
			// throw - something went wrong
			Exception e = new Exception("error");
			throw e;
		}
	}

}
