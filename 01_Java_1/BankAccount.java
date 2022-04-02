public class BankAccount {
  	public static void main(String[] args){
      // Declare variables
      double balance = 1000.75;
      double amountToWithdraw = 250;
      double updatedBalance = balance - amountToWithdraw;
      // Share the amount of bank account to 3 friends
      double amountForEachFriend = updatedBalance / 3;
      // Check whether or not the balance is enough to buy tickets @ 250
      boolean canPurchaseTicket = amountForEachFriend >= 250;

      // Print whether user can purchase ticket
      System.out.println(canPurchaseTicket);

      // Print how much money is given to each friend
      System.out.println("I gave each friend " + amountForEachFriend + "...");
    }       
}
