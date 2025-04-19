import java.util.Scanner;
public class Difference{	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int a = input.nextInt();

	System.out.print("Enter an integer: ");
	int b = input.nextInt();

	 int squareA = a * a;
	 int squareB = b * b;
	
	int square = a * b;
	System.out.printf("The square %d%n", square);
	
	int sum = a + b;
	System.out.printf("The sum %d%n", sum);
	
	int difference = a - b;
	System.out.printf("The difference %d%n", difference);




}


}