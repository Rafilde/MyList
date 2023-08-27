package List;

public class StaticList<T> {
	Object[] v; 
	int cont;
	
	public StaticList(int n) {
		v = new Object[n]; 
		cont = 0;
	}
	public void add(T value) {
		if (cont == v.length) {
			addMore();
		}
		v[cont] = value;
		cont++;
	}
	public void addMore() {
		Object[] z = new Object[v.length + (v.length/2)];
        for (int i = 0; i < v.length; i++) {
            z[i] = v[i];
        }
        v = z;
	}
	public void addPosition(int pos, T value) {
		if(pos < cont) {
			for (int i = cont; i > pos; i--) { 
				v[i] = v[i - 1]; 
			}
			v[pos] = value;
			cont++; 
		} else {
			System.out.println("error! i can't find this position");
		}
	}
	public void clear() {
		/*do {
			remove(0);
		}while(cont != 0);*/
		cont = 0;
		v = new Object[10];
	}
	public void removeElement(T value) {
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
	public int indexOf(T elemento) {
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
	public Object get(int pos) {
		return v[pos];
	}
	public boolean contains(T elemento) {
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
