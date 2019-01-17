package dp.observer;

public class BombInChina implements Explosive{

	@Override
	public void explode() {
		System.out.println("China is now missing in the map!");
	}

}
