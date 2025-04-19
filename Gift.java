import java.util.Scanner;
public class Gift{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int num2 = input.nextInt();
	
	int num1Tripled = num1 + num1 + num1;
	int num2Double = num2 + num2;

	if(num1Tripled % num2Double == 0){
	System.out.printf("The first integer tripled is multiple of second %d", num1);
	}

	if(num1Tripled % num2Double != 0){
	System.out.printf("The first integer tripled is not multiple of second %d", num1);
	}






}
}