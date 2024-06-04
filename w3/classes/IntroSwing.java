package w3.classes;

import javax.swing.*;
import java.awt.*;

public class IntroSwing {
  public static void main(String[] args) {
    
    //add code below this line

    JFrame window = new JFrame("Hello");
    window.setSize(300, 300);
    // window.setLayout(new GridLayout(2, 2));
    
    // JLabel text1 = new JLabel("One", JLabel.CENTER);
    // JLabel text2 = new JLabel("Two", JLabel.CENTER);
    // JLabel text3 = new JLabel("Three", JLabel.CENTER);
    // JLabel text4 = new JLabel("Four", JLabel.CENTER);
    
    // window.add(text4);
    // window.add(text2);
    // window.add(text1);
    // window.add(text3);

    // ImageIcon feather = new ImageIcon("feather.png");
    ImageIcon feather = new ImageIcon("w3/classes/studentFolder/feather.png");
    JLabel image = new JLabel(feather);
    window.add(image);

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

    //add code above this line
  }
}