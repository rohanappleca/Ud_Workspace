package interfacexamples;

public class FirefoxDriver implements Webdriver{

	public static void main(String[] args) {
		
		FirefoxDriver ff=new FirefoxDriver();
	    ff.click();
	    ff.sendKeys();
	    ff.getTitle();
	    
		

	}

	@Override
	public void click() {
		
		System.out.println("Click from Firefox Class");
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		System.out.println("Send Keys from Firefox Class");
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		System.out.println("geT Title from Firefox Class");
	}

	

}
