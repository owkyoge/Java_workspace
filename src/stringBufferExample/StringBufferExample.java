package stringBufferExample;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		/* 1) StringBuffer Class append() Method
		The append() method concatenates the given argument with this String.*/

		StringBuffer sb = new StringBuffer("Mohan ");
		sb.append("Sai ");
		sb.append("Owk");
		System.out.println(sb);
		
	/* 2) StringBuffer insert() Method
The insert() method inserts the given String with this string at the given position.   */	
		
		sb.insert(1,"OOO");
		System.out.println(sb);
		
		/* 3) StringBuffer replace() Method
The replace() method replaces the given String from the specified beginIndex and endIndex. */ 

		sb.replace(1, 3, "AAAA");
		System.out.println(sb);
		
		/* 4) StringBuffer delete() Method
The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.   */ 
		
		sb.delete(1,3);
		System.out.println(sb);

		/* 5) StringBuffer reverse() Method
The reverse() method of the StringBuilder class reverses the current String.  */
		
		sb.reverse();
		System.out.println(sb);

		//  6) StringBuffer capacity() Method
		
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("This is My programming");
		System.out.println(sb.capacity());
		
		// 7) StringBuffer ensureCapacity() method

		System.out.println(sb.capacity());
		sb.append("This is My programming");
		System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        

		

		
	}

}
