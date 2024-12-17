// 14. Write a Java program using Applet to display a message in the Applet.

import java.applet.Applet;
import java.awt.Graphics;

/*
  <applet code="MessageApplet.class" width="300" height="200">
  </applet>
*/

// Applet class extending the Applet class
public class MessageApplet extends Applet {
    // Override the paint method to display the message
    public void paint(Graphics g) {
        // Display the message on the applet window
        g.drawString("Hello, welcome to Java Applet!", 50, 100);
    }
}
