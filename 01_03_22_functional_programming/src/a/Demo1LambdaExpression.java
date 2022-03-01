package a;

public class Demo1LambdaExpression {

	public static void main(String[] args) {
		
		MyRunnable r2 = new MyRunnable();
		Thread t2 = new Thread(r2);
		t2.start();
		
		
		
		// anonymous inner class
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("ruuning");
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		

	}

}
