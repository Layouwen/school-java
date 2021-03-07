package 对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo1 implements ActionListener {
  JFrame frame;
  JDialog dialog;
  JButton button;

  public static void main(String[] args) {
    Demo1 that = new Demo1();
    that.go();
  }

  public void go() {
    frame = new JFrame("我是窗口");
    dialog = new JDialog(frame, "Dialog", true);
    dialog.getContentPane().add(new JLabel("Hello, I'm a Layouwen"));
    dialog.setSize(60, 40);
    button = new JButton("展示 Dialog");
    button.addActionListener(this);

    frame.getContentPane().add(button, BorderLayout.SOUTH);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(200, 150);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    dialog.setVisible(true);
  }
}
