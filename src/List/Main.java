package List;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		StaticList lista = new StaticList();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);
		System.out.println(lista.indexOf(30));
		System.out.println(lista.size());
		System.out.println(lista);
		/*lista.add("Peru");
		lista.add("OI");
		lista.add("Ola");
		lista.add("Eae");
		lista.add("Pão");
		lista.add("Manga");
		lista.add("Afonso");
		System.out.println(lista);
		lista.size();
		lista.addPosition(3, "Natan");
		System.out.println(lista);
		lista.size();
		lista.add("Peru");
		lista.add("OI");
		lista.add("Ola");
		lista.add("Eae");
		lista.add("Pão");
		lista.add("Manga");
		lista.add("Afonso");
		lista.add("Peru");
		lista.add("OI");
		lista.add("Ola");
		lista.add("Eae");
		lista.add("Pão");
		lista.add("Manga");
		lista.add("Afonso");
		lista.add("Peru");
		lista.add("OI");
		lista.add("Ola");
		lista.add("Eae");
		lista.add("Pão");
		lista.add("Manga");
		lista.add("Afonso");
		lista.add("Peru");
		lista.add("OI");
		lista.add("Ola");
		lista.add("Eae");
		lista.add("Pão");
		lista.add("Manga");
		lista.add("Afonso");
		lista.add("Peru");
		lista.add("OI");
		lista.add("Ola");
		lista.add("Eae");
		lista.add("Pão");
		lista.add("Manga");
		lista.add("Afonso");
		lista.add("Peru");
		lista.add("OI");
		lista.add("Ola");
		lista.add("Eae");
		lista.add("Pão");
		lista.add("Manga");
		lista.add("Afonso");
		System.out.println(lista);
		lista.size();
		System.out.println("O elemento da posição x é: " + lista.get(0));	
		System.out.println("Esse nome tem na lista ? " + lista.contains("Manga"));		
		System.out.println("Posição do elemento: " + lista.indexOf("Manga"));
		lista.remove(0);
		System.out.println(lista);
		lista.remove(6);
		System.out.println(lista);
		lista.removeElement("Natan");
		System.out.println(lista);
		lista.size();
		lista.clear();
		System.out.println(lista);
		lista.size();
		lista.add("Eae");
		lista.add("Pão");
		lista.add("Manga");
		lista.add("Afonso");
		System.out.println(lista);*/
		/*lista.add(23);
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
		
		System.out.println("Posição do elemento: " + lista.indexOf(5));
		
		lista.remove(0);
		System.out.println(lista);
		lista.remove(6);
		System.out.println(lista);
		
		lista.removeElement(42);
		System.out.println(lista);
		lista.size();
		
		lista.clear();
		System.out.println(lista);
		lista.size();
		
		for(int i = 0; i < 30; i++) {
			lista.add(rand.nextInt(100));
		}
		System.out.println(lista);*/
	}
}
