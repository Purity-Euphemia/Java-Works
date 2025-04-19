import java.util.Scanner;
public class Diameter{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an radius");
	int radius = input.nextInt();

	System.out.print("diameter: ");
	int diameter = radius * 2;
	System.out.printf("%d\n", diameter);

	System.out.print("circumference: ");
	double circumference = 2 * 3.14159 * radius;
	System.out.printf("%.2f\n", circumference);

	System.out.print("area: ");
	double area = 3.14159 * radius * radius;
	System.out.printf("%.2f\n", area);






}

}