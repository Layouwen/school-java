package 菜单组件;

import javax.swing.*;
import java.awt.*;

public class Demo1 {
  JFrame frame = new JFrame("我是一个窗体");
  JTextField tf = new JTextField();

  public static void main(String[] args) {
    Demo1 that = new Demo1();
    that.go();
  }

  public void go() {
    // 创建菜单栏
    JMenuBar menubar = new JMenuBar();
    // 创建菜单项
    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Edit");
    menubar.add(menu1);
    menubar.add(menu2);
    JMenu item1 = new JMenu("one");
    JMenuItem item2 = new JMenuItem("two");
    JMenuItem item3 = new JMenuItem("three");
    menu1.add(item1);
    menu1.add(item2);
    menu1.add(item3);
    JMenuItem item11 = new JMenuItem("one-one");
    JMenuItem item12 = new JMenuItem("one-two");
    item1.add(item11);
    item1.add(item12);
//    frame.getContentPane().add(menubar, BorderLayout.NORTH);
    frame.setJMenuBar(menubar);

    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(300, 200);
  }
}
