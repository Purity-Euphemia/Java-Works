import java.util.Scanner;
public class Positive{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

                  System.out.println("Enter first number:");
                  int num1 = input.nextInt();

                  System.out.println("Enter second number:");
                  int num2 = input.nextInt();

                  int result;

		 if((num1 > 0  && num2 > 0) || (num1 < 0 && num2 < 0)){
                    result = num1 * num2;
                    System.out.println("Both numbers are either negative or positive");
                   System.out.println("Product:"+ result);
          
               }else {
                   result = num1 + num2;
                   System.out.println("Numbers have different signs.");
                   System.out.println("Sum:"+ result);
                 }
                 
                   }
                 }