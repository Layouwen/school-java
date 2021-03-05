package 绘图基础;

import java.awt.*;

public class Demo1 {
  public static void main(String[] args) {
    // 获取计算机所有可用字体
    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] fontNames = env.getAvailableFontFamilyNames();
    System.out.println("可用字体:");
    for (int i = 0; i < fontNames.length; i++) {
      System.out.println(" " + fontNames[i]);
    }
  }
}
