package singleton;

/**
 * In this approach we can restrict synchronized block to execute only 
 * when instance is null. once instance is created there will no
 * synchronization is used.
 * 
 * @author revanth_v
 *
 */
public class SingletonDoubleCheckSynchronizedLazyInitializationObject {

	private SingletonDoubleCheckSynchronizedLazyInitializationObject() { }

	private static SingletonDoubleCheckSynchronizedLazyInitializationObject instance;

	public static SingletonDoubleCheckSynchronizedLazyInitializationObject getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SingletonDoubleCheckSynchronizedLazyInitializationObject();
				}
			}
		}
		return instance;
	}
}
