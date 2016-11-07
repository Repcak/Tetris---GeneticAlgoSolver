package TetrisGA;

import javax.swing.*;

import java.awt.*;

/**
 * Created by XXX on 07.11.2016.
 */
public class Panel extends JPanel {

    public Test test;

    public Panel(Test test){

        this.test = test;

        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.WHITE);

        JTextField text = new JTextField(20);

        add(text);



    }
}
