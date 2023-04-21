package main;

class HardDrive {
	char[] data = {'d', 'a', 't', 'a', 'a',  'b', 'c', 'd', 'e'};
	
	public char[] Read(long lba, int size) {
		System.out.println("Kovalevylä pyydetty data alkaen indeksistä " + lba + ", alueen koko " + size + "\n");
		char[] read = new char[size];
		int index = 0;
		
		for(int i = (int) lba; i < lba + size; i++) {
			read[index] = data[i];
			index++;
		}
		
		return read;
	}
}
