import java.util.Scanner;
public class removeSection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Input :");
	String str = input.nextLine();

	//first h position
	int firstH = str.indexOf('h');
	//last h position
	int lastH = str.lastIndexOf('h');

	String ans = str.substring(0, firstH) + str.substring(lastH + 1);

	 System.out.println("Correct Answer: " + ans );
	}
}