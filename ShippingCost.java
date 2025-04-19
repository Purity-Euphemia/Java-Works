//Prompts the user to enter the weight of the packaga.

//Display the shipping cost.

//Display wheather the weight is greater than 50, if so (The package cannot be shipping).


import java.util.Scanner;
public class ShippingCost {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	double weightOfThePackage = input.nextDouble();

	double cost1 = 3.5;
	double cost3 = 5.5;
	double cost10 = 8.5;
	double cost20 = 10.5;

	
	if(weightOfThePackage <= 1){
	System.out.printf("The shipping cost %.2f", cost1);
}

	else if(weightOfThePackage <= 3){
	System.out.printf("The shipping cost %.2f", cost3);
}

	else if(weightOfThePackage <= 10){
	System.out.printf("The shipping cost %.2f", cost10);
}
	else if (weightOfThePackage <= 20 ){
	System.out.printf("The shipping cost %.2f", cost20);
}	

	else{
	System.out.printf("The package is not shipping");
}	


}
}
			