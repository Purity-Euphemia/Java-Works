import java.util.Scanner;
public class Small{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	

	System.out.print("Enter first integers: ");
	int num1 = input.nextInt();

	System.out.print("Enter second integers: ");
	int num2 = input.nextInt();

	System.out.print("Enter third integers: ");
	int num3 = input.nextInt();

	System.out.print("Enter fourth integers: ");
	int num4 = input.nextInt();

	System.out.print("Enter fifth integers: ");
	int num5 = input.nextInt();


	if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
	System.out.printf("The first largest integer %d%n", num1);
	}

	if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
	System.out.printf("The second largest integer %d%n", num2);
	}

	if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
	System.out.printf("The third largest integer %d%n%", num3);
	}
	
	if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
	System.out.printf("The fourth largest integer %d%n", num4);
	}
	
	if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num5){
	System.out.printf("The fifth largest integer %d%n", num5);
	}
	
	if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
	System.out.printf("The first smallest integer %d%n", num1);
	}

	if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
	System.out.printf("The second smallest integer %d%n", num2);
	}

	if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
	System.out.printf("The third smallest integer %d%n", num3);
	}
	
	if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
	System.out.printf("The fourth smallest integer %d%n", num4);
	}
	
	if(num5 < num1 && num5 < num2 && num5 < num3 && num5 < num5){
	System.out.printf("The fifth smallest integer %d%n", num5);
	}
	





}
}