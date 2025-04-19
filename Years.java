import java.util.Scanner;
public class Years{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of minutes: ");
	double minutesNumber = input.nextDouble();

	new hours(minutesNumber/60);

	new days(newHours/24);

	new years(newDays/365);

	remaining Days = newYears * 365;
	System.out.printf("The minutes is appromately", + newYears + days + remainingDays);









}



}