package 布局管理器;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
  private JFrame frame;
  private JButton button1, button2, button3;

  public static void main(String[] args) {
    FlowLayoutDemo that = new FlowLayoutDemo();
    that.go();
  }

  public void go() {
    frame = new JFrame("我是Flow布局");
    Container contentPane = frame.getContentPane(); // 内容窗格
    contentPane.setLayout(new FlowLayout()); // 设置为 FlowLayout 布局

    // 创建3个按钮
    button1 = new JButton("ok");
    button2 = new JButton("Open");
    button3 = new JButton("Close");

    // 将按钮添加到内容窗格
    contentPane.add(button1);
    contentPane.add(button2);
    contentPane.add(button3);

    frame.setSize(200, 100);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
