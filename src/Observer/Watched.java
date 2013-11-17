package Observer;

import java.util.Observable;

/**
 * 被观察者
 * 
 * @author root
 * 
 */
public class Watched extends Observable {
	private String data = "";

	public String retrieveData() {
		return data;
	}

	public void changeData(String data) {
		if (!this.data.equals(data)) {
			this.data = data;
			setChanged();
		}
		notifyObservers(data);
	}
}
