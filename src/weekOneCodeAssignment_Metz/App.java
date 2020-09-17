package weekOneCodeAssignment_Metz;

public class App {

	public static void main(String[] args) {
		
		// Declarations
		double itemPrice, walletMoney;
		double friendAmount, age;
		String nameFirst;
		String nameLast;
		char middleInitial;
		
		// Assignment
		itemPrice = 3.25;
		walletMoney = 50.81;
		friendAmount = 250;
		age = 35;
		nameFirst = "Tobias";
		nameLast = "Jo-Hannas-Burg";
		middleInitial = 'B';
		
		// Initialization 
		//finding how much money is left after purchase
		double purchase = (walletMoney-itemPrice);
		//finding out how many friends one makes yearly
		double yearlyFriends = (friendAmount/age);
		//full name
		String nameFull = ((nameFirst) + " " + (middleInitial) + " " + (nameLast));
        
		//Printing out
		System.out.println("The candy I want is $" + itemPrice);
		System.out.println("I only have $" + walletMoney + " in my wallet");
		System.out.println("After buying it I had $" + purchase + " left");
		
		System.out.println("I am " + age + " years old");
		System.out.println("I have amassed " + friendAmount + " friends in my lifetime");
		System.out.println("That means I've made " + yearlyFriends + " per year!");
		
		System.out.println("my full name is " + nameFull);
		 
	}

}
