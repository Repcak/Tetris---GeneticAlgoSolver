package TetrisGA;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BoardPanel extends JPanel{

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 5055679736784226108L;

    /**
     * The width of the border around the game board.
     */
    private static final int BORDER_WIDTH = 5;

    /**
     * The number of columns on the board.
     */
    public static final int COL_COUNT = 10;

    /**
     * The number of visible rows on the board.
     */
    public static final int ROW_COUNT = 20;

    /**
     * The number of pixels that a tile takes up.
     */
    public static final int TILE_SIZE = 22;

    /**
     * The total width of the panel.
     */
    public static final int PANEL_WIDTH = COL_COUNT * TILE_SIZE + BORDER_WIDTH * 2;

    /**
     * The total height of the panel.
     */
    public static final int PANEL_HEIGHT = ROW_COUNT * TILE_SIZE + BORDER_WIDTH * 2;

    /**
     * The tiles that make up the board.
     */
    //private TileType[][] tiles;

    public BoardPanel() {

        //this.tiles = new TileType[ROW_COUNT][COL_COUNT];

        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.WHITE);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //This helps simplify the positioning of things.
        g.translate(BORDER_WIDTH, BORDER_WIDTH);


        /*
         * Draw the background grid above the pieces (serves as a useful visual
         * for players, and makes the pieces look nicer by breaking them up.
         */
        g.setColor(Color.DARK_GRAY);
        for(int x = 0; x < COL_COUNT; x++){
            for(int y = 0; y < ROW_COUNT; y++){
                g.drawLine(0, y * TILE_SIZE , TILE_SIZE * COL_COUNT, y * TILE_SIZE);
                g.drawLine(x * TILE_SIZE, 0, x * TILE_SIZE, TILE_SIZE * ROW_COUNT);
            }
        }

		 //Draw the outline
        g.setColor(Color.WHITE);
        g.drawRect(0, 0, TILE_SIZE * COL_COUNT, TILE_SIZE * ROW_COUNT);

        //Loads up image from file for background(22x22 pix)
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File("Tile2.png"));
        }catch (IOException e){
        }

        //Creates background from loaded image
        for(int x = 0; x < COL_COUNT; x++) {
            int cordX = x* TILE_SIZE;
            for (int y = 0; y < ROW_COUNT; y++) {
                int cordY = y * TILE_SIZE;
                g.drawImage(img, cordX, cordY, null);
            }
        }
    }
}
