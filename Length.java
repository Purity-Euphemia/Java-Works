import java.util.Scanner;
public class Length{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter speed in meters/second: ");
	double speedNumber = input.nextDouble();

	System.out.print("Enter acceleration in meters/second: ");
	double accelerationNumber = input.nextDouble();

	double length = (speedNumber * speedNumber)/(2 * accelerationNumber);
	System.out.printf("The minimum runway length for this airplane %.3f", length);


}
}