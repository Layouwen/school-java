package 考前复习;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo34 {
  public static void main(String[] args) {
    try {
      FileOutputStream out = new FileOutputStream("C:\\test.txt");
      out.write('t');
      out.write('e');
      out.write('s');
      out.write('t');
    } catch (IOException e) {
      System.out.println("发生异常");
    }
  }
}
