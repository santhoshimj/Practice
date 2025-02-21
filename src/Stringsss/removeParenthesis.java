package Stringsss;

public class removeParenthesis {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String rem = "(hello world)";
		
		String result = rem.replace("(", " ").replace(")"," " );
		System.out.println("the result is : " + result);

	}

}
