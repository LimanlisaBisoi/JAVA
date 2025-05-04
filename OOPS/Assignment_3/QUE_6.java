/*Write a java program to calculate the monthly electricity bill. The tariff is given as follows:
Price per unit Unit range
Rs. 3/- First 50 units
Rs. 4.80/- 50-200 units
Rs. 5.80/- 200-400 units
Rs. 6.20/- Above 400 units                                                               */                       
import java.util.Scanner;
public class QUE_6 {

	public static void main(String[] args) {
		System.out.println("Enter the power consumption: ");
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		double bill;
		if(units<=50) {
			bill = units*3.00;
		}
		else if(units<=200) {
			bill = 50*3+(units);
		}
		else if(units<=400) {
			bill = 50*3+150*4.80+(units-200);
		}
		else{
			bill = 50*3+150*4.8+(units-200*5.8)+(units-400*6.20);
		}
		System.out.println("You have to pay bill Rs."+bill);

	}

}
