package stringexample;

public class BufferTest {
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("hello");  // hellojavaworld
	//	StringBuffer buffer = new StringBuffer();  // javaworld
		buffer.append("java");
		buffer.append("world");
		System.out.println(buffer);
		
	}

}

