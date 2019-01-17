package dp.observer;

import java.util.ArrayList;
import java.util.List;

public class ButtonOfDoom implements Trigger {

	private List<Explosive> explosives = null;
	
	public ButtonOfDoom() {
		explosives = new ArrayList<>();
	}
	
	public void connect(Explosive e) {
		if(!explosives.contains(e))
			explosives.add(e);
	}

	public void disconnect(Explosive e) {
		explosives.remove(e);
	}

	@Override
	public void fireAll() {
		for(Explosive o : explosives) {
			o.explode();
		}
	}
}
