import java.util.Scanner;
public class Division{
	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	int userInteger = userInput.nextInt();	

	int divisionOfUserNumber = userInteger / 3;
	int divisionOfUserRemainder = userInteger % 3;

	if (divisionOfUserRemainder == 0) {
	System.out.printf("The number you entered is: %d is divisible by 3 and how many times without remainder %d", userInteger, divisionOfUserNumber);
	
}

	if (divisionOfUserRemainder != 0) {
	System.out.printf("The number you entered is: %d and is not divisible by 3 because it has a remainder of %d", userInteger, divisionOfUserRemainder);

}
	









}
}