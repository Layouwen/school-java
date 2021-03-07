package 对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Demo3 implements ActionListener {
  JFrame frame = new JFrame("我是文件对话框");
  JFileChooser fc = new JFileChooser();
  JTextField tf = new JTextField();
  JButton openButton, saveButton, deleteButton;

  public static void main(String[] args) {
    Demo3 that = new Demo3();
    that.go();
  }

  public void go() {
    openButton = new JButton("Open a File...");
    openButton.addActionListener(this);

    saveButton = new JButton("Save a File");
    saveButton.addActionListener(this);

    deleteButton = new JButton("Delete a File");
    deleteButton.addActionListener(this);

    JPanel jp = new JPanel();
    jp.add(openButton);
    jp.add(saveButton);
    jp.add(deleteButton);

    frame.getContentPane().add(jp, BorderLayout.CENTER);
    frame.getContentPane().add(tf, BorderLayout.SOUTH);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(300, 200);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    if (button == openButton) {
      int select = fc.showOpenDialog(frame);
      if (select == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        tf.setText("Opening: " + file.getName());
      }else {
        tf.setText("Open command cancelled by user");
      }
    }

    if(button == saveButton) {
      int select = fc.showSaveDialog(frame);
      if(select == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        tf.setText("Saving: " + file.getName());
      }else {
        tf.setText("Save command cancelled by user");
      }
    }

    if(button == deleteButton) {
      int select = fc.showDialog(frame, "删除");
      if(select==JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        tf.setText("Deletling: " + file.getName());
      }else {
        tf.setText("Delete command cancelled by user");
      }
    }

  }
}
