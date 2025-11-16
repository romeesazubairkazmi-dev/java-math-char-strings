import java.util.Scanner;

public class circleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();

        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        double earthRadius = 6371.01;

        double d = earthRadius * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) +  Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2) );
                       
       System.out.println("The distance between the two points is " + d + " km");
    }
}
