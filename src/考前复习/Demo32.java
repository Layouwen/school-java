package 考前复习;

public class Demo32 {
  public static void main(String[] args) {
    String s1 = "abc123";
    boolean isEqual;
    isEqual = s1.startsWith("ab");
    String s2;
    s2 = s1.substring(0, 2);
    System.out.println(isEqual + "," + s2);
  }
}
