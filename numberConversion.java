import java.util.Scanner;
public class numberConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Enter a decimal value (0 to 15): ");
	int value = input.nextInt();
	
	if(value >= 0 && value <=15 ) {
	String hex = Integer.toHexString(value).toUpperCase();
	System.out.println("The hex value is " + hex); }
	else {
	 System.out.println(value + " is an invalid input"); }

	//b
	System.out.print("Enter a hex digit: ");
        String hex = input.next().toUpperCase();
	
	// hex to decimal to binary 
	if (hex.matches("[0-9A-F]")) {
            int decimal = Integer.parseInt(hex, 16);
            String binary = Integer.toBinaryString(decimal);
            System.out.println("The binary value is " + binary); }
         else {
            System.out.println(hex + " is an invalid input"); }
	}
}