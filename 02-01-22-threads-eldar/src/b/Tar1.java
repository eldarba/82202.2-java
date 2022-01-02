package b;

public class Tar1 {

	public static void main(String[] args) throws InterruptedException {
		
		StopThread t = new StopThread();
		t.start();
		
		Thread.sleep(5000);
		
		t.interrupt();

	}

}
