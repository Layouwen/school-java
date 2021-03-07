package 菜单组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo2 implements ActionListener, ItemListener {
  JFrame frame = new JFrame("我是综合的菜单选项");
  JTextField tf = new JTextField();

  public static void main(String[] args) {
    Demo2 that = new Demo2();
    that.go();
  }

  public void go() {
    JMenuBar menuBar = new JMenuBar();
    frame.setJMenuBar(menuBar);
    JMenu menu, subMenu;
    JMenuItem menuItem;

    menu = new JMenu("File");
    menu.setMnemonic(KeyEvent.VK_F);
    menuBar.add(menu);

    menuItem = new JMenuItem("Open...");
    menuItem.setMnemonic(KeyEvent.VK_O);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
    menuItem.addActionListener(this);
    menu.add(menuItem);

    menuItem = new JMenuItem("Save", KeyEvent.VK_S);
    menuItem.addActionListener(this);
    menuItem.setEnabled(false);
    menu.add(menuItem);

    menuItem = new JMenuItem("Close");
    menuItem.setMnemonic(KeyEvent.VK_C);
    menuItem.addActionListener(this);
    menu.add(menuItem);

    // 添加分割线
    menu.add(new JSeparator());

    menuItem = new JMenuItem("Exit");
    menuItem.setMnemonic(KeyEvent.VK_E);
    menuItem.addActionListener(this);
    menu.add(menuItem);

    menu = new JMenu("Option");
    menuBar.add(menu);
    menu.add("Font...");

    subMenu = new JMenu("Color...");
    menuBar.add(menu);
    menu.add("Font...");

    menuItem = new JMenuItem("Foreground");
    menuItem.addActionListener(this);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
    subMenu.add(menuItem);

    menuItem = new JMenuItem("Background");
    menuItem.addActionListener(this);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
    subMenu.add(menuItem);

    menu.addSeparator();

    JCheckBoxMenuItem cm = new JCheckBoxMenuItem("Always On Top");
    cm.addItemListener(this);
    menu.add(cm);

    menu.addSeparator();

    JRadioButtonMenuItem rm = new JRadioButtonMenuItem("Small", true);
    rm.addItemListener(this);
    menu.add(rm);

    ButtonGroup group = new ButtonGroup();
    group.add(rm);
    rm = new JRadioButtonMenuItem("Large");
    rm.addItemListener(this);
    menu.add(rm);
    group.add(rm);

    menu = new JMenu("Help");
    menuBar.add(menu);
    menuItem = new JMenuItem("about...", new ImageIcon("about.png"));
    menuItem.addActionListener(this);
    menu.add(menuItem);

    tf.setEditable(false);
    frame.getContentPane().add(tf, BorderLayout.SOUTH);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }

  public void itemStateChanged(ItemEvent e) {
    int state = e.getStateChange();
    JMenuItem amenuItem = (JMenuItem) e.getSource();
    String command = amenuItem.getText();
    if (state == ItemEvent.SELECTED) {
      tf.setText(command + "SELECTED");
    } else {
      tf.setText(command + "DESELECTED");
    }
  }

  public void actionPerformed(ActionEvent e) {
    tf.setText(e.getActionCommand());
    if (e.getActionCommand() == "Exit") {
      System.exit(0);
    }
  }
}
