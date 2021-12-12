package c;

public class Cinema {

	private String address;
	private int capacity;

	public Cinema(String address, int capacity) {
		super();
		this.address = address;
		this.capacity = capacity;
	}

	public Cinema() {
		super();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
