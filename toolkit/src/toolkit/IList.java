package toolkit;

public interface IList {
	
	void append(Object object); 
	
	Object get(int index);
	
	int length();
	
	boolean drop(int index);
	
}
