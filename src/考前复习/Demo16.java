package 考前复习;

class Rectangle {
  int width;
  int height;

  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
    System.out.println("周长为:" + zhouchang() + " 面积为：" + mianji());
  }

  int zhouchang() {
    return (this.width + this.height) * 2;
  }

  int mianji() {
    return this.width * this.height;
  }
}

public class Demo16 {
  public static void main(String[] args) {
    new Rectangle(3, 4);
  }
}
