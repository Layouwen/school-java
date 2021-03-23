package 考前复习;

import java.io.*;

public class Demo8 {
  public static void main(String[] args) {
    try {
      File f = new File("e:\\test.txt");
      System.out.println("文件名：" + f.getName());
      FileInputStream fis = new FileInputStream(f);
      InputStreamReader isr = new InputStreamReader(fis);
      BufferedReader br = new BufferedReader(isr);
      String str = "";
      System.out.println("内容是：");
      while ((str = br.readLine()) != null) {
        System.out.println(str);
      }
      br.close();
      System.out.println("长度为：" + f.length());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
