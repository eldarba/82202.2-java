package f.waitAndNotify;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Stack stack = new Stack();
		Producer p1 = new Producer("p1", stack);
		p1.start();
		
		Consumer c1 = new Consumer("c1", stack);
		Thread.sleep(1000);
		c1.start();

	}

}
