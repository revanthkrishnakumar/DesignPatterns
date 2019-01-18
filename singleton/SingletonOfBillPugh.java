package singleton;

/**
 * In this approach we use inner class to create new instance. even though the inner
 * class is static it will not be loaded at the time of class loading. It will be 
 * loaded only when we can InstanceHelper.INSTANCE method. thus It'll support lazy init.
 * 
 * @author revanth_v
 *
 */
public class SingletonOfBillPugh {

	private SingletonOfBillPugh() {	}

	private static class InstanceHelper{
		private static final SingletonOfBillPugh INSTANCE = new SingletonOfBillPugh();
	}
	
	public static SingletonOfBillPugh getInstance() {
		return InstanceHelper.INSTANCE;
	}
}
