package dp.observer;

public class BombInAmerica implements Explosive {

	@Override
	public void explode() {
		System.out.println("USA is destroyed. It'll be USI");
	}
}
