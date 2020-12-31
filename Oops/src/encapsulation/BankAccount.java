package encapsulation;

public class BankAccount {

	public int accountNum = 123456;
	public int pinNo = 1234;
	public double balAmount = 10000;

	public void withDrawCash(int accNum, int pin, double amount) {

		if (accountNum == accNum && pinNo == pin) {

			System.out.println("Login successful");

			if (amount <= balAmount) {
				balAmount = balAmount - amount;
				System.out.println("Amount withdrawn successfully"+amount);

			}

			else {

				System.out.println("Insufficient funds");
				
			}

		}

		else {

			System.out.println("Invalid credentials");
		}

	}

	public void setPin(int accNum, int oldPin,int newPin) {

		if (accountNum == accNum && pinNo == oldPin) {
			pinNo = newPin;
			System.out.println("Pin changed successfully");

		}

		else {

			System.out.println("Pin could not be changed-Invalid credentials-");
		}
	}
}
