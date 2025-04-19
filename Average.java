import java.util.Scanner;
public class Average{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	 
	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();


	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();


	System.out.print("Enter fourth number: ");
	int fourthNumber  = input.nextInt();


	System.out.print("Enter fifth number: ");
	int fifthNumber = input.nextInt();


	if(firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber 	< fourthNumber && firstNumber < fifthNumber){
	System.out.printf("The first number is smallest");
}


	if(secondNumber < firstNumber && secondNumber < thirdNumber && 	secondNumber < fourthNumber && secondNumber < fifthNumber){
	System.out.println("The second number is smallest");
}


	if(thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber 	< fourthNumber && thirdNumber < fifthNumber){
	System.out.println("The third number is smallest");
}


	if(fourthNumber < firstNumber && fourthNumber < secondNumber && 	fourthNumber < thirdNumber && fourthNumber < fifthNumber){
	System.out.println("The first number is smallest");
}


	if(fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber 	< thirdNumber && fifthNumber < fourthNumber){
	System.out.println("The first number is smallest");
}
	
	if(firstNumber > secondNumber && firstNumber > thirdNumber && 	firstNumber > fourthNumber && firstNumber > fifthNumber){
	System.out.println("The first number is largest");
}

	if(secondNumber > firstNumber && secondNumber > thirdNumber && 	secondNumber > fourthNumber && secondNumber > fifthNumber){
	System.out.println("The second number is largest");
}


	if(thirdNumber > firstNumber && thirdNumber > secondNumber && 	thirdNumber > fourthNumber && thirdNumber > fifthNumber){
	System.out.println("The third number is largest");
}



	if(fourthNumber > firstNumber && fourthNumber > secondNumber && 	fourthNumber > thirdNumber && fourthNumber > fifthNumber){
	System.out.println("The first number is largest");
}


	if(fifthNumber > firstNumber && fifthNumber > secondNumber && 	fifthNumber > thirdNumber && fifthNumber > fourthNumber){
	System.out.println("The first number is smallest");
}

	int average  = (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber) /2;

	System.out.printf("The average of the even numbers %d", average);











}
}