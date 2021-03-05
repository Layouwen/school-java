package 事件处理;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo1 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("我是窗口");
    MyButton b = new MyButton("close");
    frame.getContentPane().add(b, BorderLayout.CENTER);
    frame.setVisible(true);
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class MyButton extends JButton implements ActionListener {
  public MyButton(String text) {
    super(text);
    addActionListener(this); // 注册事件侦听程序
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("成功退出");
    System.exit(0);
  }
}
