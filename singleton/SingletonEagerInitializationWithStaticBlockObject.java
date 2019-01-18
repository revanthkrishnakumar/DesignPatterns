package singleton;

/**
 * In this approach we can handle exception but, object of this class also
 * created at the time of loading the class
 * 
 * @author revanth_v
 *
 */
public class SingletonEagerInitializationWithStaticBlockObject {

	private static SingletonEagerInitializationWithStaticBlockObject instance;

	private SingletonEagerInitializationWithStaticBlockObject() { }

	static {
		try {
			instance = new SingletonEagerInitializationWithStaticBlockObject();
		} catch (Exception e) {
			System.err.println("Unable to create instance");
		}
	}

	public static SingletonEagerInitializationWithStaticBlockObject getInstance() {
		return instance;
	}
}
