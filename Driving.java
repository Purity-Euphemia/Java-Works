import java.util.Scanner;
public class Driving{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the distance to drive: ");
	double distanceNumber = input.nextDouble();

	System.out.print("Enter the miles per gallon: ");
	double milesNumber = input.nextDouble();

	System.out.print("Enter the price per gallon: ");
	double priceNumber = input.nextDouble();

	double costOfDriving = distanceNumber * priceNumber / milesNumber; 

	System.out.printf("The cost of driving is %.2f", costOfDriving);




}

}