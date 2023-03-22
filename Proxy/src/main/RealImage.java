package main;

public class RealImage implements Image {
	private final String filename;
	private final String date;

	public RealImage(String filename, String date) {
		this.filename = filename;
		this.date = date;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		System.out.println("Loading   " + filename);
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);

	}

	@Override
	public void showData() {
		System.out.println("Filename " + filename + ", date " + date);

	}

}
