import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Game {

	Game game = new Game();
	private double HEIGHT;
	private double WIDTH;
	
	public void Start() {
		
		WIDTH = (Toolkit.getDefaultToolkit().getScreenSize().width / 2);
		HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height - (Toolkit.getDefaultToolkit().getScreenSize().height / 10);

		JFrame gameFrame = new JFrame("Game");
		gameFrame.add(game);
		gameFrame.setBounds((int)WIDTH, (int)HEIGHT, (int)WIDTH, (int)HEIGHT);
		gameFrame.setForeground(Color.MAGENTA);
		gameFrame.setBackground(Color.BLACK);
		gameFrame.setResizable(false);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) {
				
				game.move();
				game.repaint();
				Thread.sleep(10);

		}
		
	}
	
	private void paint(Graphics g) {
		
		super.paint(g);
		
		
	}
	
	private void move() {
		
		
		
	}
	
}
