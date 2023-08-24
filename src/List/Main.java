package List;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		StaticList lista = new StaticList(10);
		lista.add(23);
		lista.add(4);
		lista.add(6);
		lista.add(5);
		System.out.println(lista);
		lista.getSize();
		lista.addPosition(2, 10);
		System.out.println(lista);
		lista.getSize();
		for(int i = 0; i < 30; i++) {
			lista.add(rand.nextInt(100));
		}
		System.out.println(lista);
		
	}
}
