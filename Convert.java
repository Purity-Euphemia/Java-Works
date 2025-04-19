import java.util.Scanner;
public class Convert{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in pound: ");
	double number = input.nextDouble();

	double kilograms = number * 0.454;

	System.out.printf("The kilograms is %.3f",kilograms);







}

}