package 事件处理;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Demo2 implements MouseMotionListener, MouseListener {
  private JFrame frame;
  private JTextField tf;

  public static void main(String[] args) {
    Demo2 that = new Demo2();
    that.go();
  }

  public void go() {
    frame = new JFrame("我是鼠标事件的例子");
    Container contentPane = frame.getContentPane();
    contentPane.add(new JLabel("使用鼠标进行单击和拖拽"), BorderLayout.NORTH);

    tf = new JTextField(30);
    contentPane.add(tf, BorderLayout.SOUTH);

    // 注册侦听事件
    frame.addMouseMotionListener(this);
    frame.addMouseListener(this);

    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void mouseClicked(MouseEvent e) {

  }

  @Override
  public void mousePressed(MouseEvent e) {

  }

  @Override
  public void mouseReleased(MouseEvent e) {

  }

  @Override
  public void mouseEntered(MouseEvent e) {
    tf.setText("我进来了");
  }

  @Override
  public void mouseExited(MouseEvent e) {
    tf.setText("我出去了");
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    String s = "鼠标移动中：X=" + e.getX() + "Y=" + e.getY();
    tf.setText(s);
  }

  @Override
  public void mouseMoved(MouseEvent e) {

  }
}
