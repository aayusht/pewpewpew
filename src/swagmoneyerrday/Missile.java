package swagmoneyerrday;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * The projectiles used by the shooter
 * @authors Aayush Tyagi, Nikhil Swaminathan, Martin Lee, Paramdeep Atwal, Kevin Lin
 * @period 5
 */
public class Missile extends Sprite {

    private final int MISSILE_SPEED = 10; //a constant for missile speed
    private final int NUM_OF_PEW_PEWS = 5;//number of sound clips
    
    /**
     * constructor for the class that uses the constructor in Sprite class and initMissile method to preset the values of this game
     * @param x - initial x position
     * @param y - initial y position
     */
    public Missile(int x, int y) {
        super(x, y);
        initMissile();
    }
    
    /**
     * a method that creates missile and plays an audio file
     */
    private void initMissile() {   
        loadImage("src/missile.png");
        getImageDimensions(); 
        playPewPew();
    }
    
    /**
     * a method that moves the missile up, kills it if offscreen
     */
    public void move() {
        y -= MISSILE_SPEED;
        if (y < 0) { vis = false; }
    }
    /**
     * a method that plays a random audio file from the src when shooting missiles
     */
    private void playPewPew() {
    	int random = (int)(Math.random()*NUM_OF_PEW_PEWS)+1;
    	String filename = "src/pew" + random + ".wav";
    	try {
    		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filename).getAbsoluteFile());
    		Clip clip = AudioSystem.getClip();
    		clip.open(audioInputStream);
        	clip.start(); 
    	}
    	catch (Exception e) {System.out.println(e.getMessage());}   
    }
}

