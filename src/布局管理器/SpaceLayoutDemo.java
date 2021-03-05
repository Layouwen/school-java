package 布局管理器;

import javax.swing.*;
import java.awt.*;

public class SpaceLayoutDemo {
  private JFrame frame;
  private JButton b1, b2, b3;

  public static void main(String[] args) {
    SpaceLayoutDemo that = new SpaceLayoutDemo();
    that.go();
  }

  void go() {
    frame = new JFrame("我是空布局");
    Container contentPane = frame.getContentPane();
    contentPane.setLayout(null); // 设置为空布局

    b1 = new JButton("Yes");
    contentPane.add(b1);
    b2 = new JButton("No");
    contentPane.add(b2);
    b3 = new JButton("Cancel");
    contentPane.add(b3);

    b1.setBounds(30, 15, 75, 20);
    b2.setBounds(0, 50, 75, 50);
    b3.setBounds(160, 20, 75, 30);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}
