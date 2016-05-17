package swagmoneyerrday;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * The player's craft
 * @authors Aayush Tyagi, Nikhil Swaminathan, Martin Lee, Paramdeep Atwal, Kevin Lin
 * @period 5
 */
public class Shooter extends Sprite {

    private int dx; //change in x
    private final int SPEED = 10; //constant for speed
    private int speed = SPEED; //instance variable version of the constant SPEED
    private ArrayList<Missile> missiles; //arraylist of missile objects
    private boolean keyPressed = false;//key tracker
    private int ammo;//number of ammo
    private int shots = 0;//number of ammos fired

    /**
     * constructor that initializes its instance variables with the given parameters to preset the values of the game
     * @param x - initial y position 
     * @param y - initial y position 
     * @param ammo - initial number of ammo
     */
    public Shooter(int x, int y, int ammo) {
        super(x, y);
        this.ammo = ammo;
        initCraft();
    }
    /**
     * method used to create the craft using methods in Sprite class
     */
    private void initCraft() {
        missiles = new ArrayList<>();
        loadImage("src/craft.png");
        getImageDimensions();
    }
    /**
     * method used in Board to move the craft
     */
    public void move() {
        x += dx;
        if (x < 1) { x = 1; }
        if (y < 1) { y = 1; }
    }
    /**
     * method that returns the arraylist of missile objects
     * @return arraylist of missile objects
     */
    public ArrayList getMissiles() { return missiles; }
    
    /**
     * a method that checks for keys pressed  
     * @param e - key pressed 
     */
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
        	if (!keyPressed) { fire(); }
            keyPressed = true;
        }
        if (key == KeyEvent.VK_SHIFT) { speed = SPEED / 2;}
        if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) { dx = -speed; }
        if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) { dx = speed; }
    } 
    /**
     * a method used in KeyPressed method to shoot a missile
     */
    public void fire() {
        missiles.add(new Missile(x + width / 2 - 8, y));
        ammo--;
        shots++;
    }
    /**
     * a method that returns number of ammo
     * @return ammo
     */
    public int ammo() { return ammo; }
    /**
     * a method that returns number of shots
     * @return shots
     */
    public int shots() { return shots; }
    /**
     * a method that adds one ammo
     */
    public void addAmmo() { ammo++; }
    /**
     * a method that tracks released keys
     * @param e - key released
     */
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) { keyPressed = false; }
        if (key == KeyEvent.VK_SHIFT) { speed  = SPEED; }
        if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) { dx = 0; }
        if (key == KeyEvent.VK_D  || key == KeyEvent.VK_RIGHT) { dx = 0; }
    }
}
