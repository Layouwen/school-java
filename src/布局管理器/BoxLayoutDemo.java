package 布局管理器;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
  private JFrame frame;
  private JPanel pv, ph;

  public static void main(String[] args) {
    BoxLayoutDemo that = new BoxLayoutDemo();
    that.go();
  }

  public void go() {
    frame = new JFrame("我是Box模型");
    Container contentPane = frame.getContentPane();

    pv = new JPanel();
    pv.setLayout(new BoxLayout(pv, BoxLayout.Y_AXIS));
    pv.add(new JLabel("第一个"));
    pv.add(new JLabel("第二个"));
    pv.add(new JLabel("第三个"));
    contentPane.add(pv, BorderLayout.CENTER);

    ph = new JPanel();
    ph.setLayout(new BoxLayout(ph, BoxLayout.X_AXIS));
    ph.add(new JLabel("Yes"));
    ph.add(new JLabel("No"));
    ph.add(new JLabel("Cancel"));
    contentPane.add(ph, BorderLayout.SOUTH);

    frame.pack();
    frame.setVisible(true);
  }
}
