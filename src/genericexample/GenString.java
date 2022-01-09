package genericexample;

public class GenString <T>{
	
	T ob;
	
	GenString(T ob){
		this.ob = ob;
	}

	public void show() {
		System.out.println("The type of ob is" + ob.getClass().getName());
	}
	
	public T getob() {
		return ob;
	}
	
	
	
	
	
	
	
}
