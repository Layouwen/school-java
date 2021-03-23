package 考前复习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5 {
  public static void main(String[] args) {
    String str = "";
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    try {
      while ((str = br.readLine()) != null) {
        System.out.println("内容" + str);
      }
    } catch (IOException e) {
      System.out.println("异常");
    }
  }
}
