package demos;

import app.core.Log;
import app.core.Logger;

public class LogSomething {

	public static void main(String[] args) {


		long ts = System.currentTimeMillis();
		int clientId = 102;
		String description = "deposit money";
		float amount = 250.5F;
		
		Log log = new Log(ts, clientId, description, amount);
		
		Logger logger = new Logger(null);
		logger.log(log);

	}

}
