import java.util.Scanner;
public class Display{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter an integer: ");
	int num2 = input.nextInt();

	System.out.print("Enter an integer: ");
	int num3 = input.nextInt();

	if(num2 > num1){
	System.out.printf("The num2 is greater than num1 %d%n", num2);
	}

	if(num3 > num2){
	System.out.printf("The num3 is larger than num2 %d%n", num3);
	}

	System.out.printf("The result is: true");


}
}