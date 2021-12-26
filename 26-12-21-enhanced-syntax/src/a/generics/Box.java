package a.generics;

// in generics we can define type parameters
public class Box<T> {

	// use the type parameters in the class;
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	public static void main(String[] args) {
		// when creating objects set the type by sending type arguments
		Box<String> boxOfString = new Box<>();
		boxOfString.setContent("aaa");
		
		Box<Integer> boxOfInt = new Box<>();
		boxOfInt.setContent(5);
	}

}
