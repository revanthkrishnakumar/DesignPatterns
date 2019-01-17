package dp.observer;

public interface Trigger {
	void connect(Explosive observer);
	void disconnect(Explosive observer);
	void fireAll();
}
