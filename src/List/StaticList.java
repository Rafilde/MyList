package List;

public class StaticList {
	int[] v; 
	int cont;
	
	public StaticList(int n) {
		v = new int[n]; 
		cont = 0;
	}
	public void add(int value) {
		if (cont == v.length) {
			addMore();
		}
		v[cont] = value;
		cont++;
	}
	public void addMore() {
		int[] z = new int[v.length + (v.length/2)];
        for (int i = 0; i < v.length; i++) {
            z[i] = v[i];
        }
        v = z;
	}
	public void addPosition(int pos, int value) {
		if(pos < value) {
			for (int i = cont; i > pos; i--) { //meu cont tem 4 posições, meu número 5 está na posição 3
				v[i] = v[i - 1]; //to pegando a posição 4 no v[4] e lançando para ela quem está na posição 4 - 1 = 3 (posição).
			}
			v[pos] = value;
			cont++; //aqui nosso cont = 5 ai na hora de ir pra toString ele fica cont 5;
		} else {
			System.out.println("error! i can't find this position");
		}
	}
	public void getSize() {
		System.out.println(cont);
	}
	public String toString() {
		String str = "[ "; 
		for(int i = 0; i < cont; i++) {
			str += v[i] + " ";
		}
		return str + "]";
	}
}
