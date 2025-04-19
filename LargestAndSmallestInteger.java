import java.util.Scanner;
public class LargestAndSmallestIntegers{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	System.out.print("Enter third integer: ");
	int number3 = input.nextInt();

	System.out.print("Enter fourth integer: ");
	int number4 = input.nextInt();

	System.out.print("Enter fifth integer: ");
	int number5 = input.nextInt();
	
	if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
	System.out.print("number one is the largest", number1);
}

	if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
	System.out.print("number two is the largest", number2);
}

	if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
	System.out.print("number three is the largest", number3);
}

	if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {
	System.out.print("number four is the largest", number4);
}

	if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4) {
	System.out.print("number five is the largest", number5);
}

	if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5) {
	System.out.print("number one is the smallest", number1);
}

	if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5) {
	System.out.print("number two is the smallest", number2);
}

	if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5) {
	System.out.print("number three is the smallest", number3);
}

	if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5) {
	System.out.print("number four is the smallest", number4);
}

	if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4) {
	System.out.print("number five is the smallest", number5);
}


}
}