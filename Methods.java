import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Input :");
	String str = input.nextLine();

	//third character
	System.out.println(str.charAt(2));

	//second last character
	System.out.println(str.charAt(str.length() - 2 ));

	//first five characters
	System.out.println(str.substring(0, 5));

	//all but the last two characters of this string
	System.out.println(str.substring(0, str.length() - 2));

	//characters of this string with even indices(0,2,4,....)
	for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

	//characters of this string with odd indices(1,3,5,....)
	for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
	
	//reverse
	 for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
	
	//every second character of the string in reverse order, starting from the last one.
	for (int i = str.length() - 1; i >= 0; i -= 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

	//length
	System.out.println(str.length());
	}
}
	
	