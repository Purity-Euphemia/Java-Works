import java.util.Scanner;
public class Science{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount of water in kilograms: ");
	double kilogramsNumber = input.nextDouble();

	System.out.print("Enter the initial temprature: ");
	double initialNumber = input.nextDouble();

	System.out.print("Enter the final temprature: ");
	double finalNumber = input.nextDouble();

	double energy = kilogramsNumber * 4184 * (finalNumber - initialNumber);
	System.out.printf("The energy needed is %.1f", energy);






}


}