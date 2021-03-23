package 考前复习;

import java.util.Vector;

public class Demo9 {
  public static void main(String[] args) {
    Vector v = new Vector();
    v.add("This");
    v.add(" is a ");
    v.add("test");
    v.add("  string");
    String toDeleteString = "test";
    boolean isContain;
    isContain = v.contains(toDeleteString);
  }
}
