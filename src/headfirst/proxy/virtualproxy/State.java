package headfirst.proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public interface State {


	public ImageIcon getImageIcon();

	public int getIconWidth();

	public int getIconHeight();

	public void paintIcon(final Component c, Graphics g, int x, int y);
}
