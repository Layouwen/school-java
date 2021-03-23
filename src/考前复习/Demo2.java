package 考前复习;

interface IPerson {
  public void setFood(String food);

  public void eat();
}

class Person implements IPerson {
  public String food;

  public void setFood(String food) {
    this.food = food;
    System.out.println("食物为" + food);
  }

  public void eat() {
    System.out.println("正在吃" + food);
  }
}

public class Demo2 {
  public static void main(String[] args) {
    Person p = new Person();
    p.setFood("汉堡包");
    p.eat();
  }
}
