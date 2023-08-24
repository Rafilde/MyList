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
		
		lista.size();
		
		lista.addPosition(2, 10);
		System.out.println(lista);
		lista.size();
		
		for(int i = 0; i < 30; i++) {
			lista.add(rand.nextInt(100));
		}
		System.out.println(lista);
		
		System.out.println("O elemento da posição x é: " + lista.get(0));
		
		System.out.println("Esse número tem na lista ? " + lista.contains(0));
		
		System.out.println("Posição do elemento: " + lista.indexOf(59));
	}
}
