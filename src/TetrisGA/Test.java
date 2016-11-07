package TetrisGA;

import javax.swing.*;
import java.awt.*;

/**
 * Created by XXX on 07.11.2016.
 */



public class Test extends JFrame {

    public Panel panel;



    public Test(){

        super("Test");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        panel = new Panel(this);

        add(panel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
