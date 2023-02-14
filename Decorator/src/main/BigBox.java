package main;


public class BigBox implements Box {

	private Box boxToBeDecorated = null;
	private String[] boxItems = {"football", "hammer", "spoon", "fork", "clock"};
	
	public BigBox(Box boxToBeDecorated) {
		this.boxToBeDecorated = boxToBeDecorated;
	}
	
	public BigBox() {}

	@Override
	public void open() {
		if(boxToBeDecorated != null){boxToBeDecorated.open();}
		openBigBox();
	}

	private void openBigBox() {
		System.out.println("BigBox opened!\n");
		for(String s: boxItems) {
			System.out.println(s);
		}
	}



}
