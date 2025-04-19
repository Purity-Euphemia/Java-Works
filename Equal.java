import java.util.Scanner;
public class Equal{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	int integer = input.nextInt();

	int number = integer * integer;

	if(integer > 100){
	System.out.println("The number is greater than 100");
}
	
	if(integer == 100){
	System.out.println("The number is equal to 100");
}
	
	if(integer != 100){
	System.out.println("The number is not equal to 100");
}

	if(integer < 100){
	System.out.println("The number is less than 100");
}

	if(number > 100){
	System.out.println("The integer is greater than 100");
}

	if(number == 100){
	System.out.println("The integer is equal to 100");
}

	if(number != 100){
	System.out.println("The integer is not equal to 100");
}

	if(number < 100){
	System.out.println("The integer is less than 100");
}


}
}