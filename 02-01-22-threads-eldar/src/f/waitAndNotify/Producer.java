package f.waitAndNotify;

public class Producer extends Thread {
	
	private Stack stack;

	// CTOR
	public Producer(String name, Stack stack) {
		super(name);
		this.stack = stack;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			int r = (int) (Math.random()*101);
			stack.push(r);
			System.out.println(getName() + " pushed: " + r);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
