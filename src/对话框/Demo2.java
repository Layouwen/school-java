package 对话框;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo2 {
  public static void main(String[] args) {
    Demo2 that = new Demo2();
    that.go();
  }

  public void go() {
    JFrame frame = new JFrame("我是各种对话框的Demo");
    JPanel panel = new JPanel();

    // showMessageDialog
    JButton button1  = new JButton("showMessageDialog——ERROR_MESSAGE");
    button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(panel, "消息提示", "Title", JOptionPane.ERROR_MESSAGE);
      }
    });

    JButton button2 = new JButton("showMessageDialog——INFORMATION_MESSAGE");
    button2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(panel, "消息提示", "Title", JOptionPane.INFORMATION_MESSAGE);
      }
    });

    JButton button3 = new JButton("showMessageDialog——WARNING_MESSAGE");
    button3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(panel, "消息提示", "Title", JOptionPane.WARNING_MESSAGE);
      }
    });

    JButton button4 = new JButton("showMessageDialog——QUESTION_MESSAGE");
    button4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(panel, "消息提示", "Title", JOptionPane.QUESTION_MESSAGE);
      }
    });

    JButton button5 = new JButton("showMessageDialog——PLAIN_MESSAGE");
    button5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(panel, "消息提示", "Title", JOptionPane.PLAIN_MESSAGE);
      }
    });

    // showConfirmDialog
    JButton button6 = new JButton("showConfirmDialog——DEFAULT_OPTION");
    button6.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(panel, "消息提示", "Title", JOptionPane.DEFAULT_OPTION);
      }
    });

    JButton button7 = new JButton("showConfirmDialog——YES_NO_OPTION");
    button7.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int rtn = JOptionPane.showConfirmDialog(panel, "消息提示", "Title", JOptionPane.YES_NO_OPTION);
        System.out.println("What I received is: " + rtn);
      }
    });

    JButton button8 = new JButton("showConfirmDialog——YES_NO_CANCEL_OPTION");
    button8.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int rtn = JOptionPane.showConfirmDialog(panel, "消息提示", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println("What I received is: " + rtn);
      }
    });

    JButton button9 = new JButton("showConfirmDialog——OK_CANCEL_OPTION");
    button9.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int rtn = JOptionPane.showConfirmDialog(panel, "消息提示", "Title", JOptionPane.OK_CANCEL_OPTION);
        System.out.println("What I received is: " + rtn);
      }
    });

    // showInputDialog
    JButton button10 = new JButton("showInputDialog");
    button10.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String rtn = JOptionPane.showInputDialog(panel, "消息提示");
        System.out.println("What I received is: " + rtn);
      }
    });

    // showOptionDialog
    JButton button11 = new JButton("showOptionDialog");
    button11.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Object[] options = new Object[]{"Red", "Green", "Blue"};
        int rtn = JOptionPane.showOptionDialog(panel, "消息提示", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        System.out.println("What I received is: " + options[rtn]);
      }
    });

    Box vBox = Box.createVerticalBox();

    vBox.add(button1);
    vBox.add(button2);
    vBox.add(button3);
    vBox.add(button4);
    vBox.add(button5);
    vBox.add(button6);
    vBox.add(button7);
    vBox.add(button8);
    vBox.add(button9);
    vBox.add(button10);
    vBox.add(button11);

    frame.add(vBox);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
