import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1 Create a frame
        JFrame frame = new JFrame("My first frame");
        frame.setSize(500,500);
        // 2 Create a panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(100,200,150));
        // 3 Create components
        JLabel label = new JLabel("GoodBye World");
        JButton button = new JButton("Don't push button");
        JTextField textField = new JTextField(15);
        JScrollBar scrollBar = new JScrollBar(Adjustable.HORIZONTAL,10,100,1,1000);

        //Add image
        ImageIcon icon = new ImageIcon("Images/My Cards/2C.png");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);


        // 4 Add components to the panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);
        // 5 Add panel to the frame
        frame.add(panel);
        // 6 Set frame visible
        frame.setVisible(true);

    }
}