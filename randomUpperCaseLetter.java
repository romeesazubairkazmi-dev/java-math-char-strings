public class randomUpperCaseLetter {
    public static void main(String[] args) {
	// uppercase letter have ASCII 65 to 90
	int num = 65 + (int)(Math.random() * 25);
	char letter = (char) num;

	System.out.println("Random uppercase letter : "  + letter );
	}
}