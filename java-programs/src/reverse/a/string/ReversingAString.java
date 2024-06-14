package reverse.a.string;

public class ReversingAString {

	public static void main(String[] args) {
		String original = "silar";
		String reversed = reverseString(original);
		System.out.println("Original:" + original);
		System.out.println("Reversed:" + reversed);

	}

	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

}
