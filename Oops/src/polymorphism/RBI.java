package polymorphism;

public class RBI {

	public double getHomeLoanROI() {

		System.out.println("In RBI Home loan");
		return 10.25;

	}

	public RBI getObj() {

		RBI obj2 = new RBI();
		return obj2;

	}

}
