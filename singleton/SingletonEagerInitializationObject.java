package singleton;

/**
 * In this approach the singleton object is created at the time of class loading. 
 * and we can't handle any exceptions may occur while creating new instance 
 * 
 * @author revanth_v
 *
 */
public class SingletonEagerInitializationObject {
	
	private static final SingletonEagerInitializationObject INSTANCE = new SingletonEagerInitializationObject();

	private SingletonEagerInitializationObject() { }
	
	public static SingletonEagerInitializationObject getInstance() {
		return INSTANCE;
	}
}