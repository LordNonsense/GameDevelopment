package net.joker2thief.gamedev;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Roman on 06/01/2015.
 */
public class Main {

    public static void main(String[] args) {
        //SwingUtilities.invokeLater();
        new Main();
    }

    public Main() {
        JFrame frame = new JFrame();
        frame.setTitle("Game Development");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Custom Icon
        // Custom Cursor

        // Screen

        frame.setVisible(true);
    }
}
