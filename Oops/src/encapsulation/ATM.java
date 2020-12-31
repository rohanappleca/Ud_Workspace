package encapsulation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj=new BankAccount();
		obj.withDrawCash(123456, 1234, 5000);
		obj.setPin(123456, 1234,3333);

	}

}
