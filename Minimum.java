import java.util.Scanner;
public class Minimum{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter an integer: ");
	int num2 = input.nextInt();

	
	int sum = num1 + num2;
	System.out.printf("The sum %d%n", sum);

	int product = num1 * num2;
	System.out.printf("The product %d%n", product);

	int avarage = (num1 + num2) / 2;
	System.out.printf("The average %d%n", avarage);

	int distance = num1 - num2;
	System.out.printf("The distance %d%n", distance);

	//int maximum = num1 > num2;
	//System.out.printf("The maximum %d%n", maximum);

	//int maximum = num1 != num2;
	//System.out.printf("The minimum %d", minimum);
	 

	if(num1 > num2){
	System.out.printf("the maximum is %d%n", num1);
       }else{
	System.out.printf("The maximum is %d%n", num2);
       }
	
	if(num1 < num2){
	System.out.printf("the minimum is %d%n", num1);
       }else{
	System.out.printf("The minimum is %d%n", num2);
       }
}
} 