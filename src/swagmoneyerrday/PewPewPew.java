package swagmoneyerrday;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class PewPewPew extends JFrame {

	/**
	 * constructor that calls the initUI method that actually creates the game
	 */
    public PewPewPew() {
        
        initUI();
    }
    /**
     * a method that creates a new game with a screen of a particular size and centers
     * the GUI, while specifying how to kill the program (when you exit the application)
     */
    private void initUI() {
        
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("PewPewPew");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * driver that essentially starts the code and creates the window
     * while updating the GUI based on the events that take place
     * @param args
     */
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PewPewPew ex = new PewPewPew();
                ex.setVisible(true);
            }
        });
    }
}

