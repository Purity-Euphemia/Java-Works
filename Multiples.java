import java.util.Scanner;
public class Multiples{
	public static void main(String[] args) {
	Scanner input = new Scanner( System.in);

	System.out.print("Enter frist integer: ");
	int number1 = input.nextInt();

  	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	int MultiplicationOfNumber = number1 * 3;
	System.out.print(MultiplicationOfNumber);
	
	int MultiplicationOfDouble = number2 * 2;
	System.out.print(MultiplicationOfDouble);
	
	if (number1 % 2 == 0) {
	System.out.printf("\n" + "number is multiple of 2");
}
	if (number1 % 2 != 0) {
	System.out.printf("\n" + "number is not a multiple of 2");
}

	System.out.print("MultipicationOfNumber / MultiplicationOfDouble");	 


}


}