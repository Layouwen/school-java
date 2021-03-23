package 考前复习;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo14 extends JFrame implements ActionListener {
  private JButton button;
  private JLabel label;

  public Demo14() {
    button = new JButton("修改标签内容");
    label = new JLabel("原本的标签内容");
    setTitle("Java GUI 事件监听处理实例");
    setSize(300, 80);
    add(button);
    add(label);
    button.addActionListener(this);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    label.setText("这是修改后的标签内容");
  }

  public static void main(String[] args) {
    Demo14 now = new Demo14();
  }
}
