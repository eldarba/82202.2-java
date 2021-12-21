package a.generics;

public class Test {
	
	public static void main(String[] args) {
		
		{
			Box<String> box = new Box<>();
			box.setContent("aaa");
			String x = box.getContent();
		}
		{
			Box<Integer> box = new Box<>();
			box.setContent(5);
			int x = box.getContent();
		}
	}

}
