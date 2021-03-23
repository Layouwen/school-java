package 考前复习;

public class Demo4 {
  public static void main(String[] args) {
    String str = "public static void main(String args[]){}";
    int count = 0;
    int index = -1;
    String findChar = "a";
    index = str.indexOf(findChar);
    while (index > 0) {
      count++;
      int offset = index + 1; // index += findChar.length()
      index = str.indexOf(findChar, offset);
//      str = str.substring(index + 1);
//      index = str.indexOf(findChar);
    }
    System.out.println("字符串中共有" + count + "个字符a。");
  }
}
