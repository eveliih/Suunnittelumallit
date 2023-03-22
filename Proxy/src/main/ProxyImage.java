package main;

public class ProxyImage implements Image {
	private final String filename;
	private final String date;

	private RealImage image;

	public ProxyImage(String filename, String date) {
		this.filename = filename;
		this.date = date;
	}

	@Override
	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename, date);
		}
		image.displayImage();

	}

	@Override
	public void showData() {
		System.out.println("Showing data: " + filename + ", " + date);
	}

}
