package 文本组件;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo1 {
  JFrame frame = new JFrame("我是窗体");
  JTextArea ta1, ta2;
  JButton copy, clear;

  public static void main(String[] args) {
    Demo1 that = new Demo1();
    that.go();
  }

  public void go() {
    ta1 = new JTextArea(3, 15);
    ta1.setSelectedTextColor(Color.red);

    ta2 = new JTextArea(7, 20);
    ta2.setEditable(true);

    JScrollPane jsp1 = new JScrollPane(ta1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    JScrollPane jsp2 = new JScrollPane(ta2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    copy = new JButton("Copy");
    copy.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (ta1.getSelectedText() != null) {
          ta2.append(ta1.getSelectedText());
        } else {
          ta2.append("\n" + ta1.getText() + "\n");
        }
      }
    });

    clear = new JButton("Clear");
    clear.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ta2.setText("");
      }
    });

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    Border etchedBase = BorderFactory.createEtchedBorder();
    Border etched1 = BorderFactory.createTitledBorder(etchedBase, "输入框");
    Border etched2 = BorderFactory.createTitledBorder(etchedBase, "复制区");
    panel1.setBorder(etched1);
    panel2.setBorder(etched2);
    panel1.add(jsp1);
    panel1.add(copy);
    panel2.add(jsp2);
    panel2.add(clear);

    Container cp = frame.getContentPane();
    cp.add(panel1, BorderLayout.NORTH);
    cp.add(panel2, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
  }
}
