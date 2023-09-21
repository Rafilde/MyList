package List;

public class StaticList<T> {
	Object[] v; 
	int n = 10;
	int cont;
	
	public StaticList() {
		v = new Object[n]; 
		cont = 0;
	}
	public void add(T value) {
		if (cont >= v.length) {
			Object[] z = new Object[v.length + (v.length/2)];
			for (int i = 0; i < v.length; i++) {
	            z[i] = v[i];
	        }
			v = z;
		}
		v[cont] = value;
		cont++;
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
		cont = 0;
		v = new Object[10];
	}
	public void removeElement(T value) {
		remove(indexOf(value));
	}
	public void remove(int pos) {
		if (pos >= 0 && pos < cont) {
	        for (int i = pos; i < cont - 1; i++) {
	            v[i] = v[i + 1];
	        }
	        cont--;
	    } else {
	        System.out.println("error! Invalid position to remove");
	    }
	}
	public int indexOf(T elemento) {
		for(int i = 0; i < cont; i++) {
			if(v[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	public int size() {
		return cont;
	}
	public Object get(int pos) {
		if(pos >= cont) {
			  throw new ArrayIndexOutOfBoundsException(pos);
		} 
		return (T) v[pos];
	}
	public void set(int pos, T elemento) {
		if(pos >= cont) {
			throw new ArrayIndexOutOfBoundsException(pos);
		}
		v[pos] = elemento;
	}
	public boolean isEmpty() { 
		return cont == 0;
	}
	public boolean contains(T elemento) {
		for(int i = 0; i < cont; i++) {
			if(v[i].equals(elemento)) {
				return true;
			}
		}
		return false; 
	}
	public String toString() {
		StringBuilder str = new StringBuilder(); 
		for(int i = 0; i < cont; i++) {
			 str.append(v[i]);
			 if(i < cont - 1) {
				 str.append(", ");
			 }
		}
		return "["+str.toString()+"]";
	}
}
