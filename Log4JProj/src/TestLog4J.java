import org.apache.log4j.Logger;

public class TestLog4J {

	
	
	static Logger log=Logger.getLogger(TestLog4J.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    log.info("Hello info");
	    log.debug("Hello Debug ");
	    log.error("Hello Error");
	}

}
