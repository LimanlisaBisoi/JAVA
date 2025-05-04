/*From the above question no. (6) write a java program with a choice if the consumer wants to pay bill 
 online. Consumer who pays their electricity bill online will get a discount of 3%.
Here is the sample output:
No. of units consumed: 867
Do you want to pay online(y/n): y
Total amount: 4925.4
Discount: 147.762
Amount payable: 4777.638                                                                            */
import java.util.Scanner;
public class QUE_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the power consumption: ");
		double unit = sc.nextDouble();
		double totalAmount = unit*5.6;
		System.out.println("DO you want to pay bill online?(y/n)");
		String choice = sc.next();
		if(choice.equals("y")){
			double discount = totalAmount*0.03;
			double amountPayble = totalAmount-discount;
			System.out.println("discount:"+discount);
			System.out.println("Amount payble:"+amountPayble);
		}
		else System.out.println("Total amount payble:"+totalAmount);
		
	}

}
