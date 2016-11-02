package TetrisGA;

import java.awt.BorderLayout;
import javax.swing.*;


public class Tetris extends JFrame {

    private BoardPanel board;
    private SidePanel side;

    public int score;


    public Tetris() {



		/*
		 * Set the basic properties of the window.
		 */
        super("Tetris");

        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        board = new BoardPanel();
        side = new SidePanel(this);

		/*
		 * Add the BoardPanel and SidePanel instances to the window.
		 */

        add(board, BorderLayout.CENTER);
        add(side, BorderLayout.EAST);

		pack();
		setVisible(true);


    }

    public void startGame(){
        this.score = 0;

        while(true){

            score++;
            side.repaint();
        }
    }
}

