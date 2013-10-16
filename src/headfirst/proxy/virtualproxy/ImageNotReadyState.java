package headfirst.proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

public class ImageNotReadyState implements State {
	boolean retrieving = false;
	Thread retrievalThread;
	ImageIcon imageIcon = null;
	URL imageURL;

	public ImageNotReadyState(URL imageURL) {
		this.imageURL = imageURL;
	}
	
	public ImageIcon getImageIcon(){
		return this.imageIcon;
	}

	@Override
	public int getIconWidth() {
		return 800;
	}

	@Override
	public int getIconHeight() {
		return 600;
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
		if (!retrieving) {
			retrieving = true;
			retrievalThread = new Thread(new Runnable() {
				public void run() {
					try {
						imageIcon = new ImageIcon(imageURL, "CD Cover");
						c.repaint();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			retrievalThread.start();
		}
	}
}
