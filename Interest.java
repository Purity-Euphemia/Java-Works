import java.util.Scanner;
public class Interest{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the balance: ");
	double balanceNumber = input.nextDouble();

	System.out.print("Enter the annualInterestRate: ");
	double annualInterestRateNumber = input.nextDouble();

	double interest = balanceNumber * annualInterestRateNumber/1200;
	System.out.printf("The interest is %5f", interest);


}

}