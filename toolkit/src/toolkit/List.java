package toolkit;

public class List implements IList {
	
	private Object[] array = new Object[10];
	
	private int posicaoLivre = 0;
	
	@Override
	public void append(Object o) {
		if (o == null) return; // cláusula guarda
		
		checkCapacity();
		
		array[posicaoLivre++] = o;
			
		// posicaoLivre = posicaoLivre + 1;
	}

	@Override
	public Object get(int index) {
		if (index < 0 || index >= length()) return null;
		return array[index];
	}

	@Override
	public int length() {		
		return posicaoLivre;
	}

	@Override
	public boolean drop(int index) {
		if (get(index) == null) return false;
		// 5, 7, 12, 34, 44, 55, null, null, null
		// 0  1  2   3   4   5
		for (int i = index + 1; i <= length(); i++) {
			array[i - 1] = array[i];
		}
		
		posicaoLivre--;
		
		return true;		
	}
	
	private void checkCapacity() {
		if (posicaoLivre == array.length) {
			Object[] novoArray = new Object[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				novoArray[i] = array[i];
			}
			array = novoArray;
		}
	}


}
