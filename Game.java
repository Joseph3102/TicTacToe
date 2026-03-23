import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.awt.image.BufferedImage;
import java.security.Key;
import java.text.DecimalFormat;


public class Game extends JPanel implements KeyListener {

private BufferedImage back;


    char currentPlayer = 'X';


    public static void main(String[] args) {
    JFrame frame = new JFrame("Tic Tac Toe");
    Game game = new Game();

    frame.add(game);
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);





        Board board = new Board();


        board.printBoard();         
    }

    public void paint (Graphics g) {



        if (back==null) {
				back = (BufferedImage) (createImage(getWidth(), getHeight()));
					}




        Graphics2D twoDgraph = (Graphics2D)g;
        Graphics g2d = back.createGraphics();



        g2d.setColor(Color.black);

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            g2d.drawRect(100 + j*50, 100 + i*50, 50, 50);
                        }
                    }
        g2d.drawRect(100, 100, 50, 50);

        twoDgraph.drawImage(back, 0, 0, null);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}
