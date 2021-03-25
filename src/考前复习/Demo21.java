package 考前复习;

public class Demo21 {
  void strReverse(String str) {
    String newStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      newStr += str.charAt(i);
    }
    System.out.println(newStr);
  }

  public static void main(String[] args) {
    Demo21 me = new Demo21();
    me.strReverse("bcdsdf");
  }
}
