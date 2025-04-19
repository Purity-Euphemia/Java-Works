import java.util.Scanner;
public class Health{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a weight in pounds: ");
	double firstNumber = input.nextDouble();

	System.out.print("Enter a height in inches: ");
	double secondNumber = input.nextDouble();
	
	double kilograms = firstNumber * 0.45359237;
	double meter = secondNumber * 0.0254;
	
	double squareMeter = meter * meter;

	double bodyMassIndex = kilograms/squareMeter;

	System.out.printf("The bodyMassIndex is %.4f",bodyMassIndex);




}

}