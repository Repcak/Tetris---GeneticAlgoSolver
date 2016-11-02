package TetrisGA;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Graphics;



import javax.swing.*;

public class SidePanel extends JPanel  {

    /**
     * Serial Version UID.
     */
    private Tetris tetris;

    private static final long serialVersionUID = 2181495598854992747L;


    public SidePanel(Tetris tetris) {
        this.tetris = tetris;


        setPreferredSize(new Dimension(200, BoardPanel.PANEL_HEIGHT));
        setBackground(Color.BLACK);
        setLayout(null);


    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //This helps simplify the positioning of things.
        g.translate(10, 10);


        /*
		 * Draw the outline.
		 */
        g.setColor(Color.WHITE);
        g.drawString("Points: ", 5, 10);
        g.drawString(Integer.toString(tetris.score), 60, 10);



    }
}