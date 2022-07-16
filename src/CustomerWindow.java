import java.awt.*;
import javax.swing.*;

public class CustomerWindow {

    public static void createWindow() {

        // create and set up the window
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        //Create and set up the window.
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

}
