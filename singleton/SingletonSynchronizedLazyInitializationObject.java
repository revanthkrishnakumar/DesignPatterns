package singleton;

/**
 * This singleton class will be created at the moment when getInstance is called
 * for the first time. But, synchronization will slow down the process of getting
 * instance every time. we need do synchronization only when we are creating new 
 * objects to prevent more than one thread enter into the get instance block when 
 * instance is null. We don't need to synchronize once object is created isn't it?
 * 
 * @author revanth_v
 *
 */
public class SingletonSynchronizedLazyInitializationObject {

	private SingletonSynchronizedLazyInitializationObject() { }

	private static SingletonSynchronizedLazyInitializationObject instance;
	
	public static synchronized SingletonSynchronizedLazyInitializationObject getInstance() {
		if(instance==null) {
			instance = new SingletonSynchronizedLazyInitializationObject();
		}
		return instance;
	}
}
