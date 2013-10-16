package headfirst.proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ImageReadyState implements State {
	ImageIcon imageIcon = null;
	
	public ImageReadyState(ImageIcon imageIcon){
		this.imageIcon=imageIcon;
	}

	@Override
	public int getIconWidth() {
		return imageIcon.getIconWidth();
	}

	@Override
	public int getIconHeight() {
		return imageIcon.getIconHeight();
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		imageIcon.paintIcon(c, g, x, y);
	}

	@Override
	public ImageIcon getImageIcon() {
		return this.imageIcon;
	}
}
