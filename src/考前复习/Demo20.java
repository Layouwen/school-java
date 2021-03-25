package 考前复习;

interface MyInterface {
  public void setName(String name);
}

interface MyInterface2 {
  public String getName();
}

public class Demo20 implements MyInterface, MyInterface2 {
  String name;

  public static void main(String[] args) {
    Demo20 me = new Demo20();
    me.setName("梁又文");
    System.out.println(me.getName());
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }
}
