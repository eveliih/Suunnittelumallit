package main;

class Memory {
	char[] muisti;
	
	public void Load(long position, char[] data) {
		muisti = data;
		System.out.println("Ladattu muistiin:");
		for(int i = 0; i < muisti.length; i++) {
			System.out.println(muisti[i]);
		}
	}
}