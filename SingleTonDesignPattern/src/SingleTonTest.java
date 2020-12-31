
public class SingleTonTest {

	private static SingleTonTest instance = new SingleTonTest();

	private SingleTonTest() {

	}

	public static SingleTonTest getInstance() {
		return instance;

	}

}
