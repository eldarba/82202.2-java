package f.waitAndNotify;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Stack stack = new Stack();
		Producer p1 = new Producer("p1", stack);
		p1.start();
		
		Consumer c1 = new Consumer("c1", stack);
		Consumer c2 = new Consumer("c2", stack);
		Thread.sleep(2000); // main waits before starting the consumers
		c1.start();
		c2.start();

	}

}
