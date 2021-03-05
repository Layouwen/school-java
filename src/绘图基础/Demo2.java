package 绘图基础;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo2 implements ActionListener {
  JFrame frame;
  MyButton button;
  MyPanel panel;
  int tag = 1;

  public static void main(String[] args) {
    Demo2 that = new Demo2();
    that.go();
  }

  public void go() {
    frame = new JFrame("绘画窗口");
    button = new MyButton("绘画");
    panel = new MyPanel();
//
    button.addActionListener(this);
//
    frame.getContentPane().add(button, "South");
    frame.getContentPane().add(panel, "Center");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(360, 200);
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (tag == 0) {
      tag = 1;
      button.setText("绘画");
    } else {
      tag = 0;
      button.setText("清空");
    }
    panel.repaint();
  }

  class MyButton extends JButton {
    public MyButton(String text) {
      super(text);
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.red);
      int width = getWidth();
      int height = getHeight();
      g.drawOval(4, 4, width - 8, height - 8);
    }
  }

  class MyPanel extends JPanel {
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      int xpoints[] = {280, 300, 320, 290, 260};
      int ypoints[] = {120, 120, 130, 150, 130};
      if (tag == 0) {
        g.setColor(Color.blue);
        g.drawLine(40, 25, 30, 50);

        g.setColor(Color.green);
        g.drawRect(100, 50, 100, 46);

        g.setColor(Color.red);
        g.drawRoundRect(73, 32, 56, 37, 10, 16);

        g.setColor(Color.yellow);
        g.fillOval(180, 60, 60, 45);

        g.setColor(Color.pink);
        g.fillArc(250, 32, 90, 60, 15, 30);

        g.setColor(Color.magenta);
        g.fillPolygon(xpoints, ypoints, 5);

        g.setColor(Color.red);
        g.fillRect(10, 110, 80, 30);

        g.setColor(Color.green);
        g.fillRect(50,120,80,30);

        g.setXORMode(Color.blue);
        g.fillOval(90, 130, 80, 30);
      }
    }
  }
}
