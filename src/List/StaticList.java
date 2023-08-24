package List;

public class StaticList<T> {
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
			for (int i = cont; i > pos; i--) { 
				v[i] = v[i - 1]; 
			}
			v[pos] = value;
			cont++; 
		} else {
			System.out.println("error! i can't find this position");
		}
	}
	public void removeElement(int value) {
		remove(indexOf(value));
	}
	public void remove(int pos) {
		if(pos >= 0) {
			for(int i = pos; i < cont; i++) {
				v[i] = v[i + 1];
			}
		}
		cont--;
	}
	public int indexOf(int elemento) {
		for(int i = 0; i < cont; i++) {
			if(elemento == v[i]) {
				return i;
			}
		}
		return -1;
	}
	public void size() {
		System.out.println(cont);
	}
	public int get(int pos) {
		return v[pos];
	}
	public boolean contains(int elemento) {
		for(int i = 0; i < cont; i++) {
			if(v[i] == elemento) {
				return true;
			}
		}
		return false; 
	}
	public String toString() {
		String str = "[ "; 
		for(int i = 0; i < cont; i++) {
			str += v[i] + " ";
		}
		return str + "]";
	}
}
