package 考前复习;

import java.util.Vector;

public class Demo1 {
  public static void main(String[] args) {
    Vector v = new Vector(10);
    v.add("字符串");
    System.out.println(v.capacity());
    v.add("你好");
    System.out.println(v.capacity());
  }
}
