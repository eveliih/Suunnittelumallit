package main;

public class Main {

	public static void main(String[] args) {
		Box decoratedBox = new BigBox(new SecretBox());
		
		decoratedBox.open();
	}

}
