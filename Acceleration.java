import java.util.Scanner;
public class Acceleration{
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter starting velocity in meter/second: ");
	double startingVelocity = input.nextDouble();

	System.out.print("Enter ending velocity in meter/second: ");
	double endingVelocity = input.nextDouble();

	System.out.print("Enter time span in seconds: ");
	double timeSpan = input.nextDouble();

	double avarageAcceleration = (startingVelocity-endingVelocity)/timeSpan;
	System.out.printf("The avarage acceleration is %.4f",avarageAcceleration);



}

}