
public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.equals("Hello"));
		
		String s = new String("Hello");
		System.out.println("equality opoerator: "+ s == str);
		System.out.println(".equals method: " + (s.equals(str)));
		
		String strReference = str;
		System.out.println("pass by reference: " + (strReference == str));
		
		// use the length() method
		System.out.println("str length: " + str.length());
		
		// use the indexOf() method
		System.out.println("indexOf() method: " + str.indexOf("H"));
		
		System.out.println(".toUpperCase(): " + str.toUpperCase());
		System.out.println(".toLoverCase(): " + str.toLowerCase());
		System.out.println(".charAt(int): " + str.charAt(2));
		System.out.println(".equalsIgnoreCase(String): " + str.equalsIgnoreCase(s));
		
		// substring method
		System.out.println("Substring starting from index 1: " + str.substring(1));
		System.out.println("Substring starting from index 1, ending at index 3: " + str.substring(1, 3));
	}

}
