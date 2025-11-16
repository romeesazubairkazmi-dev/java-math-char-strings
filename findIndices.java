import java.util.Scanner;
public class findIndices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Input :");
	String str = input.nextLine();
	int first = str.indexOf('f');
	int last = str.lastIndexOf('f');

	if( first == -1) {
	System.out.println(" "); }
	else if (first == last) {
	System.out.println("Correct Answer: " + first ); }
	else {
	System.out.println("Correct Answer: " + first + " " + last ); }
	}
}