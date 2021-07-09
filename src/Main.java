import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose the currency unit that you want to convert ");
		System.out.println("1)" + " Dollar to Canadian Dollar");
		System.out.println("2)" + " Dollar to Euro");
		System.out.println("3)" + " Canadian Dollar to Dollar");
		System.out.println("4)" + " Canadian Dollar to Euro");
		System.out.println("5)" + " Euro to Dollar");
		System.out.println("6)" + " Euro to Canadian Dollar");
		
		double dollar, euro, canadianDollar;
		
		int choise = scan.nextInt();
		
		if(choise < 1 || choise > 6) {
			System.out.println("You selected a wrong number please enter a valid number between 1 and 6.");
			
			int choise2 = scan.nextInt();
			
			System.out.println("Please enter the amount of money");
			
			int amount2 = scan.nextInt();
			
			if(choise2 == 1) {
				System.out.println(amount2 + " $" + " is " + amount2*1.25 + " Canadian Dollar");
				return;
			}
			else if(choise2 == 2) {
				System.out.println(amount2 + " $" + " is " + amount2*0.85 + " €");
				return;
			}
			else if(choise2 == 3) {
				System.out.println(amount2 + " Canadian Dollar" + " is " + amount2*0.8 + " $");
				return;
			}
			else if(choise2 == 4) {
				System.out.println(amount2 + " Canadian Dollar" + " is " + amount2*0.68 + " €");
				return;
			}
			else if(choise2 == 5) {
				System.out.println(amount2 + " €" + " is " + amount2*1.18 + " $");
				return;
			}
			else if(choise2 == 6) {
				System.out.println(amount2 + " €" + " is " + amount2*1.47 + " Canadian Dollar");
				return;
			}
		}
		
		
		System.out.println("Please enter the amount of money");
		
		int amount = scan.nextInt();
		
		if(choise == 1) {
			System.out.println(amount + " $" + " is " + amount*1.25 + " Canadian Dollar");
			return;
		}
		else if(choise == 2) {
			System.out.println(amount + " $" + " is " + amount*0.85 + " €");
			return;
		}
		else if(choise == 3) {
			System.out.println(amount + " Canadian Dollar" + " is " + amount*0.8 + " $");
			return;
		}
		else if(choise == 4) {
			System.out.println(amount + " Canadian Dollar" + " is " + amount*0.68 + " €");
			return;
		}
		else if(choise == 5) {
			System.out.println(amount + " €" + " is " + amount*1.18 + " $");
			return;
		}
		else if(choise == 6) {
			System.out.println(amount + " €" + " is " + amount*1.47 + " Canadian Dollar");
			return;
		}
		
		
		
	}

}
