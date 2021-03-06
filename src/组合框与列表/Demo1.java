package 组合框与列表;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo1 {
  // 窗体
  JFrame frame = new JFrame("我是一个Demo");
  // 选项框
  JComboBox<String> jcb1, jcb2;
  // 文本框
  JTextArea ta = new JTextArea(0, 30);

  public static void main(String[] args) {
    Demo1 cbd = new Demo1();
    cbd.go();
  }

  public void go() {
    // 创建 4 个面板
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();

    // 创建选项框的内容
    String[] itemList = {"One", "Two", "Three", "Four", "Five"};

    // 创建第一个选项框
    jcb1 = new JComboBox<String>(itemList);
    // 添加到面板 1
    p1.add(jcb1);
    // 设置第 4 个可选项为当前显示
    jcb1.setSelectedIndex(3);
    // 创建边框
    Border etched = BorderFactory.createEtchedBorder();
    Border border = BorderFactory.createTitledBorder(etched, "Uneditable JComboBox");
    p1.setBorder(border);

    // 创建第二个选项框
    jcb2 = new JComboBox<String>();
    // 添加 4 个选项
    jcb2.addItem("Six");
    jcb2.addItem("Seven");
    jcb2.addItem("Eight");
    jcb2.addItem("nine");
    // 将 jcb2 设置为可编辑
    jcb2.setEditable(true);
    // 添加到面板 2
    p2.add(jcb2);
    // 设置边框
    border = BorderFactory.createTitledBorder(etched, "Editable JComboBox");
    // 添加边框
    p2.setBorder(border);

    // 设置 ta 可以滚动
    JScrollPane jp = new JScrollPane(ta); // 添加滚动条
    // 设置 p3 的布局
    p3.setLayout(new BorderLayout());
    // 将设置滚动后的 jp 添加到面板 3
    p3.add(jp);
    // 设置边框
    border = BorderFactory.createTitledBorder(etched, "Result");
    // 添加边框
    p3.setBorder(border);

    // 事件处理
    ActionListener al = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // 获取当前的选项框
        JComboBox jcb = (JComboBox) e.getSource();
        // 判断是不是第一个选项框
        if (jcb == jcb1) {
          // 将选项插入 jh2 的第一个位置
          jcb2.insertItemAt((String) jcb1.getSelectedItem(), 0);
          ta.append("\n item " + jcb1.getSelectedItem() + " inserted");
        } else {
          ta.append("\n You selected item: " + jcb2.getSelectedItem());
          // 将选中的添加到第一个
          jcb2.addItem((String) jcb2.getSelectedItem());
        }
      }
    };

    // 开启监听
    jcb1.addActionListener(al);
    jcb2.addActionListener(al);

    // 设置 p4 的 Grid 布局
    p4.setLayout(new GridLayout(0, 1));
    // 将 p1 和 p2 添加到 p4面板
    p4.add(p1);
    p4.add(p2);
    // 获取窗体的 Pane 对象
    Container cp = frame.getContentPane();
    // 设置其窗体的布局
    cp.setLayout((new GridLayout(0, 1)));
    // 将 p3 p4 添加到窗体
    cp.add(p3);
    cp.add(p4);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
  }
}
