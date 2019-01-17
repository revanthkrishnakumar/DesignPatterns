package dp.observer;

public class MegaMind {

	public static void main(String[] args) {
		ButtonOfDoom btn = new ButtonOfDoom();
		Explosive bombInUsa = new BombInAmerica();
		btn.connect(bombInUsa);
		btn.connect(new BombInPakistan());
		btn.connect(new BombInChina());
		btn.disconnect(bombInUsa);
		btn.fireAll();
	}
}
