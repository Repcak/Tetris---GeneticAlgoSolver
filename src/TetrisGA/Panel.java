package TetrisGA;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tetris.gameSpeed=Float.parseFloat(text.getText());
                System.out.println(Tetris.gameSpeed);
            }
        });
        add(text);



    }
}
