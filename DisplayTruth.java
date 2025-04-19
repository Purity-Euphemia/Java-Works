import java.util.Scanner;
public class DisplayTruth {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first number: ");
	int FirstNumber = input.nextInt();


	System.out.print("Enter the Second number: ");
	int SecondNumber = input.nextInt();

	System.out.print("Enter the third number: ");
	int ThirdNumber = input.nextInt();


	if(SecondNumber > FirstNumber && ThirdNumber > SecondNumber){
	System.out.printf("The result is %s", true);
}

}
} 