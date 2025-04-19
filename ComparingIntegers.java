import java.util.Scanner;
public class ComparingIntegers{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int number1 = input.nextInt();
	
	int SquareOfNumber = number1 * number1;
	System.out.print(SquareOfNumber);

	if (number1 > 100) {
	System.out.printf("\n" + "number1 is greater than", number1);
}
	if (number1 == 100) {
	System.out.printf("\n" + "number1 is equal to", number1);
}
	if (number1 != 100) {
	System.out.printf("\n" + "number1 is not equal to", number1);
}
	if (number1 < 100) {
	System.out.printf("\n" + "number1 is less than ", number1);
}
	if (SquareOfNumber > 100) {
	System.out.printf("\n" + "SquareOfNumber is greater", number1);
}
	if (SquareOfNumber == 100) {
	System.out.printf("\n" + "SquareOfNumber is equal to", number1);
}
	if (SquareOfNumber != 100) {
	System.out.printf("\n" + "SquareOfNumber is not equal to", number1);
}
	if (SquareOfNumber < 100) {
	System.out.printf("\n" + "SquareOfNumber is less than", number1);
}
}
}