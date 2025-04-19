import java.util.Scanner;
public class Divide{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer");
	int userInteger = input.nextInt();

	int DivisionOfUserInteger = userInteger / 3;
	int DivisionOfUserRemainder  = userInteger % 3;

	if (DivisionOfUserInteger == 0) {
	System.out.printf("The number the user put: is divisible by 3 %d", userInteger);
}

	if (DivisionOfUserInteger != 0) {
	System.out.printf("The number the user entered: %d and is not divisible by 3 because it has a remainder of %d", userInteger);
}




}

}