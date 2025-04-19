import java.util.Scanner;
public class Justine{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int num = input.nextInt();

	if(num % 3 == 0){
	System.out.printf("The num is divisible %d", num);
}
	if(num % 3 != 0){
	System.out.printf("The num is not divisible %d", num);
}




}

}