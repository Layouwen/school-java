package 布局管理器;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayoutDemo extends MouseAdapter {
  JPanel p1, p2, p3;
  JLabel l1, l2, l3;
  CardLayout myCard;
  JFrame frame;
  Container contentPane;

  public static void main(String[] args) {
    CardLayoutDemo that = new CardLayoutDemo();
    that.go();
  }

  public void go() {
    frame = new JFrame("我是Card布局");
    contentPane = frame.getContentPane();
    myCard = new CardLayout();
    contentPane.setLayout(myCard);

    p1 = new JPanel();
    p2 = new JPanel();
    p3 = new JPanel();

    l1 = new JLabel("我是第一张卡片");
    p1.add(l1);
    p1.setBackground(Color.CYAN);

    l2 = new JLabel("我是第二张卡片");
    p2.add(l2);
    p2.setBackground(Color.YELLOW);

    l3 = new JLabel("我是第三张卡片");
    p3.add(l3);
    p3.setBackground(Color.MAGENTA);

    p1.addMouseListener(this);
    p2.addMouseListener(this);
    p3.addMouseListener(this);

    // 每个 JPanel 作为卡片加入到 frame 的内容窗格
    contentPane.add(p1, "第一张");
    contentPane.add(p2, "第二张");
    contentPane.add(p3, "第三张");

    myCard.show(contentPane, "第三张");
    frame.setSize(300, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void mouseClicked(MouseEvent e) {
    myCard.next(contentPane);
  }
}
