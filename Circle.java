import java.util.Scanner;
public class Circle{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the radius: ");
	double radius = input.nextDouble();

	double diameter = radius * radius;
	System.out.printf("The diameter %.2f %n", diameter);
	
	double circumference =( 2 *3.14159) * radius;
	System.out.printf("The circumference is %.2f %n", circumference);
	
	double area = 3.14159 * radius * radius;
	System.out.printf("The area %.2f %n", area);
	 




















}
}