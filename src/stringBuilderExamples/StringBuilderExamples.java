package stringBuilderExamples;

public class StringBuilderExamples {

	public static void main(String[] args) {

		// 1) StringBuilder append() method
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");
		sb.append("world ");
		System.out.println(sb);

		// 2) StringBuilder insert() method
		sb.insert(1, "JAVA");
		System.out.println(sb);

		// 3) StringBuilder replace() method
		sb.replace(1, 3, "java");
		System.out.println(sb);

		// 4) StringBuilder delete() method
		sb.delete(1, 3);
		System.out.println(sb);

		// 5) StringBuilder reverse() method
		sb.reverse();
		System.out.println(sb);

		// 6) StringBuilder capacity() method
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Java is my favourite language");
		System.out.println(sb.capacity());

		// 7) StringBuilder ensureCapacity() method
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Java is my favourite language");
		System.out.println(sb.capacity());
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());

	}

}
