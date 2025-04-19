import java.util.Scanner;
public class ArithematicSmallestAndLargest{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter an integer: ");
	int number2 = input.nextInt();

	System.out.print("Enter an integer: ");
	int number3 = input.nextInt();
	
	int sumTotal = (number1 + number2 + number3);
	System.out.println(sumTotal);

	int average = (number1 + number2 + number3) / 3;
	System.out.println(average);

	int product = (number1 * number2 * number3);
	System.out.println(product);

	if (number1 < number2 && number1 < number3) {
	System.out.printf("number1 is the smallest", number1);
}
	if (number2 < number1 && number2 < number3) {
	System.out.printf("number2 is the smallest", number2);
}
	if (number3 < number1 && number3 < number2) {
	System.out.printf("number3 is the smallest", number3);
}
	if (number1 > number2 && number1 > number3) {
	System.out.printf("number1 is the largest", number1);
}
	if (number2 > number1 && number2 > number3) {
	System.out.printf("number2 is the largest", number2);
}
	if (number3 > number1 && number3 > number2) {
	System.out.printf("number3 is the largest", number3);
}


}
}