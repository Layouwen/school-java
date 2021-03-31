package 考前复习;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo36 extends JFrame {
  private JFrame frame;
  private JMenuBar mb;
  private JMenu mFile;
  private JMenu mEdit;
  private JMenuItem mOpen;
  private JMenuItem mSave;
  private JMenuItem mClose;
  private JMenuItem mCopy;
  private JMenuItem mPaste;

  Demo36() {
    frame = new JFrame("主窗体");
    mb = new JMenuBar();
    mFile = new JMenu("文件");
    mEdit = new JMenu("编辑");
    mOpen = new JMenuItem("打开");
    mSave = new JMenuItem("保存");
    mClose = new JMenuItem("关闭");
    mCopy = new JMenuItem("复制");
    mPaste = new JMenuItem("粘贴");
  }

  public void showFrame() {
    frame.setSize(800, 600);
    frame.setJMenuBar(mb);
    mb.add(mFile);
    mb.add(mEdit);
    mFile.add(mOpen);
    mFile.add(mSave);
    mFile.add(mClose);
    mClose.setActionCommand("close");
    mClose.addActionListener(new MenuHandler());
    mEdit.add(mCopy);
    mEdit.add(mPaste);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Demo36 me = new Demo36();
    me.showFrame();
  }
}

class MenuHandler implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("close")) {
      System.exit(0);
    }
  }
}
