import java.util.Scanner;
public class Greater{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter an integer: ");
	int num2 = input.nextInt();

	
	int difference = num1 - num2;
	System.out.printf("The difference %d", difference);

}
}