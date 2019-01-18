package singleton;

/**
 * This singleton class will be created at the moment when getInstance is called
 * for the first time. But It is suitable for only single threaded applications
 * 
 * @author revanth_v
 *
 */
public class SingletonLazyInitializationObject {

	private SingletonLazyInitializationObject() { }

	private static SingletonLazyInitializationObject instance;
	
	public static SingletonLazyInitializationObject getInstance() {
		if(instance==null) {
			instance = new SingletonLazyInitializationObject();
		}
		return instance;
	}
}