package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * 
 * @author root
 * 
 */
public class Watcher implements Observer {
	String data = null;

	public Watcher(Watched w) {
		w.addObserver(this);
		this.data = w.retrieveData();
	}

	public void update(Observable ob, Object arg) {
		this.data = (String) arg;
	}
}
