public class CarLoan {
    // This program calculates required monthly payment for a car loan
	public static void main(String[] args) {
        // amount of car loan
        int carLoan = 10000;
        // length of car loan
        int loanLength = 3;
        // interest rate of car loan
        int interestRate = 5;
        // down payment provided by user
        int downPayment = 2000;

        // loan requirements
        if (loanLength <= 0 || interestRate <= 0) {
        System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment > carLoan) {
        System.out.println("The car can be paid in full.");
        } else {
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = monthlyBalance * interestRate / 100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.println(monthlyPayment);
        }
	}
}
