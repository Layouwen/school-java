package 绘图基础;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class Demo3 {
  JFrame frame;
  MyPanel panel;

  public static void main(String[] args) {
    Demo3 that = new Demo3();
    that.go();
  }

  public void go() {
    frame = new JFrame("画板");
    panel = new MyPanel();

    frame.getContentPane().add(panel, "Center");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(360, 200);
    frame.setVisible(true);
  }
}

class MyPanel extends JPanel {
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    Shape arc = new Arc2D.Double(30, 30, 150, 150, 40, 100, Arc2D.OPEN);
    g2d.draw(arc);
  }
}
