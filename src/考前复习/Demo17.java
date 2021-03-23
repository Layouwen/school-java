package 考前复习;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo17 extends JFrame implements ActionListener {
  JTextField f1, f2;
  JButton b1, b2;
  JLabel lb;

  Demo17() {
    f1 = new JTextField(20);
    f2 = new JTextField(20);
    b1 = new JButton("比较");
    b2 = new JButton("重置");
    b1.addActionListener(this);
    b2.addActionListener(this);
    lb = new JLabel("此处显示比较内容");
    setLayout(new FlowLayout());
    add(f1);
    add(f2);
    add(b1);
    add(b2);
    add(lb);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      if (!f1.getText().equals(f2.getText())) {
        lb.setText("两个字符串不相同");
      } else if (f1.getText().equals(f2.getText())) {
        lb.setText("两个字符串相同");
      }
    }else {
      f1.setText("");
      f2.setText("");
      lb.setText("此处显示比较内容");
    }
  }

  public static void main(String[] args) {
    Demo17 now = new Demo17();
    now.pack();
    now.setVisible(true);
  }
}
