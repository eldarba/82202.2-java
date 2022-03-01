package a;

public class Demo2Thread {

	public static void main(String[] args) {
		
		// 1. anonymous inner type
		Thread t =  new Thread() { 

			@Override
			public void run() {
				System.out.println("I am running");
			}
			
		};
		
		t.start();
		
		// 2. lambda expression
		Runnable r = ()->{
			System.out.println("running lmbda");
		};
		
		Thread t2 = new Thread(r);
		t2.start();
		

	}

}
