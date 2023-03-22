package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProxyExample {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String date = dtf.format(LocalDateTime.now());

		Image image1 = new ProxyImage("HiRes_10MB_Photo1", date);
		Image image2 = new ProxyImage("HiRes_10MB_Photo2", date);
		Image image3 = new ProxyImage("HiRes_10MB_Photo3", date);
		Image image4 = new ProxyImage("HiRes_10MB_Photo4", date);
		Image image5 = new ProxyImage("HiRes_10MB_Photo5", date);
		Image image6 = new ProxyImage("HiRes_10MB_Photo6", date);

		List<Image> proxyImagesAlbum = new ArrayList<Image>();
		Collections.addAll(proxyImagesAlbum, image1, image2, image3, image4, image5, image6);

		System.out.println("Show deteails withoad loading:");
		for (Image image : proxyImagesAlbum) {
			image.showData();
		}

		System.out.println("\nLoading necessary:");
		for (Image image : proxyImagesAlbum) {
			image.displayImage();
		}

		System.out.println("\nLoading unnecessary:");
		for (Image image : proxyImagesAlbum) {
			image.displayImage();
		}
	}

}
