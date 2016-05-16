package swagmoneyerrday;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 * abstract class that provides a general sprite superclass
 */
public abstract class Sprite {

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected boolean vis;
	protected Image image;

	/**
	 * constructor sets the x and y coordinates of the location of the sprite
	 * @param x - x coordinate
	 * @param y - y coordinate
	 */
	public Sprite(int x, int y) {
		this.x = x;
		this.y = y;
		vis = true;
	}

	/**
	 * protected method that gets the sprite's image dimensions
	 */
	protected void getImageDimensions() {
		width = image.getWidth(null);
		height = image.getHeight(null);
	}

	/**
	 * protected method that loads and initializes the actual image of the sprite
	 * @param imageName - name of uploaded image for sprite
	 */
	protected void loadImage(String imageName) {
		ImageIcon ii = new ImageIcon(imageName);
		image = ii.getImage();
	}

	/**
	 * returns actual image
	 * @return - image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * returns x position of sprite
	 * @return - x coordinate
	 */
	public int getX() {
		return x;
	}

	/**
	 * returns y position of sprite
	 * @return - y coordinate
	 */
	public int getY() {
		return y;
	}

	/**
	 * returns the value of vis
	 * @return - true for visible, false for not visible
	 */
	public boolean isVisible() {
		return vis;
	}

	/**
	 * sets whether the sprite is visible or not
	 * @param visible - true or false
	 */
	public void setVisible(Boolean visible) {
		vis = visible;
	}

	/**
	 * constructs a rectangle created by
	 * an initial (x, y) point and extended width/height
	 * @return - Rectangle object with specified dimensions
	 */
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
}