import java.util.Scanner;
public class Conversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Enter an ASCII code (0 - 127):" );
	int code = input.nextInt();
	
	System.out.println("The character for ASCII code " + code + " is " + (char) code );
	
	//b
	System.out.println("Enter a character: " );
	char ch = input.next().charAt(0);
	int unicode = (int) ch;
	System.out.println("The Unicode for the character " + ch + " is " + unicode);
	}
}
