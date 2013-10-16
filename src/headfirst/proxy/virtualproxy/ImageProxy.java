package headfirst.proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

class ImageProxy implements Icon {
	ImageIcon imageIcon;
	State state;

	public ImageProxy(URL url) {
		state = new ImageNotReadyState(url);
	}

	public int getIconWidth() {
		return state.getIconWidth();
	}

	public int getIconHeight() {
		return state.getIconHeight();
	}

	public void paintIcon(final Component c, Graphics g, int x, int y) {
		if(state.getImageIcon()!=null && state instanceof ImageNotReadyState ){
			state=new ImageReadyState(state.getImageIcon());
		}
		state.paintIcon(c, g, x, y);
	}
}
