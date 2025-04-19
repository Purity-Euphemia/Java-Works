 import java.util.*;
 public class Sum{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter an integer: ");
	int number2 = input.nextInt();
        int product;
	int product = number1 * number2;
	System.out.printf("The product of  the numbers %d", product);
	
	int sum = number1 + number2;
	System.out.printf("The sum of the numbers %d", sum);
	
	
	if(number1 > 0   && number2 > 0 = positive){
	System.out.printf("The numbers are positive %d", posi
         

	
}
}



import java.util.Scanner;
public class Positive{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

                  System.out.println("Enter first number:");
                  int num1 = input.nextInt();

                  System.out.println("Enter second number:");
                  int num2 = input.nextInt();

                  int answer;

		 if((num1 > 0  && num2 > 0) || (num1 < 0 && num2 < 0)){
                    result = num1 * num2;
                    System.out.println("Both numbers are either negative or positive");
                   System.out.println("Product:"+ answer);
          
               }else {
                   answer = num1 + num2;
                   System.out.println("Numbers is different.");
                   System.out.println("Sum:"+ answer);
                 }
                 
                   }
                 }