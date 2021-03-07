package 组合框与列表;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo2 {
  // 创建窗体
  JFrame frame = new JFrame("我是窗体");
  // 创建列表
  JList list;
  // 创建列表初始化
  DefaultListModel listModel;
  // 创建面板
  JPanel panel;
  // 创建输入框
  JTextField tf;
  // 创建按钮
  JButton button;

  public static void main(String[] args) {
    Demo2 that = new Demo2();
    that.go();
  }

  public void go() {
    // 初始化配置
    listModel = new DefaultListModel();
    // 添加默认选项
    listModel.addElement("one");
    listModel.addElement("two");
    listModel.addElement("three");
    listModel.addElement("four");
    listModel.addElement("five");
    // 将初始化配置添加到列表
    list = new JList(listModel);

    // 将 list 设置为滚动
    JScrollPane jsp = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    // 获得窗体的容器
    Container cp = frame.getContentPane();
    // 将 jsp 添加到容器中
    cp.add(jsp);
    // 创建输入框
    tf = new JTextField(15);
    // 创建按钮
    button = new JButton("添加新的选项");
    // 监听按钮事件
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // 添加 tf 输入框的内容，到 list 的选项中
        listModel.addElement(tf.getText());
      }
    });

    // 创建面板
    panel = new JPanel();
    // 将输入框添加到面板
    panel.add(tf);
    // 将按钮添加到面板
    panel.add(button);
    // 将面板添加到 cp 容器底部
    cp.add(panel, BorderLayout.SOUTH);

    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
  }
}
