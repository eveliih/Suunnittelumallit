package main;

import java.util.Iterator;

public class Saie extends Thread {
	Iterator<Integer> iterator;

	public Saie(Iterator<Integer> i) {
		iterator = i;
	}

	@Override
	public void run() {
		 while (iterator.hasNext()) {
             synchronized (iterator) {
                 System.out.println(iterator.next());
             }
         }
	}
}
