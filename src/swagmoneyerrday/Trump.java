package swagmoneyerrday;

/**
 * Class to outline a flying object that is the target of the player
 * @authors Aayush Tyagi, Nikhil Swaminathan, Martin Lee, Paramdeep Atwal, Kevin Lin
 * @period 5
 */
public class Trump extends Sprite {

    private double vx;
    private double vy = 0;
    private double a;
    /**
     * Constructor to initialize the position and velocity of the object
     * @param x - x position of the object
     * @param y - y position of the object
     * @param vx - velocity of the object
     * @param a - acceleration of the object
     */
    public Trump(int x, int y, int vx, double a) {
        super(x, y);
        this.vx = vx;
        this.a = a;
        initAlien();
    }
    /**
     * Constructor to initialize object with x and y velocity
     * @param x - x position of the object
     * @param y - y position of the object
     * @param vx - x velocity of the object
     * @param vy - y velocity of the object
     * @param a - acceleration of the object
     */
    public Trump(int x, int y, int vx, int vy, double a) {
        super(x, y);
        this.vx = vx;
        this.vy = vy;
        this.a = a;
        initAlien();
    }
    /**
     * Method to load image of object onto the screen
     */
    private void initAlien() {
        loadImage("src/trump.png");
        getImageDimensions();
    }

    /**
     * Method to add movement to the object by changing x and y positions by their velocities
     * and implement acceleration
     */
    public void move() {
    	y += (int)vy;
        x += (int)vx;
        vx += a;
    }
}
