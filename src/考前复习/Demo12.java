package 考前复习;

class ExSuper {
  public String name;
  public String nickName;

  public ExSuper(String s, String t) {
    name = s;
    nickName = t;
  }

  public String toString() {
    return name + "父类";
  }
}

public class Demo12 extends ExSuper {
  public Demo12(String s, String t) {
    super(s, t);
  }

  public String toString() {
    return name + "子类" + nickName;
  }

  public static void main(String[] args) {
    ExSuper a = new ExSuper("梁又文", "1");
    ExSuper b = new Demo12("王煜", "2");
    System.out.println(a.toString());
    System.out.println(b.toString());
  }
}
