package e;

public class Door implements AutoCloseable {
	

	public void open() {
		System.out.println("open door");
	}

	@Override
	public void close() {
		System.out.println("close door");
	}

}
