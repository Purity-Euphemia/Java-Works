import java.util.Scanner;
public class Remainder{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter an integer: ");
	int num1 = input.nextInt();


	System.out.print("Enter an integer: ");
	int num2 = input.nextInt();

	if(num1 > num2){
	System.out.println("the num1 is greater than num2");
}
	else{
	System.out.println("The num2 is the greater than num1");
}

	if(num1 % 6 == 0){
	System.out.println("The num1 is smallest");
}
	if(num2 % 6 == 0){
	System.out.println("The num2 is the smallest");
}




















}
}