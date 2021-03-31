package 考前复习;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo35 implements Serializable {
  public String name;
  public String sex;

  Demo35(String name, String sex) {
    this.name = name;
    this.sex = sex;
  }
}

class saveObject {
  public static void main(String[] args) {
    Demo35 me = new Demo35("梁又文", "男");
    try {
      FileOutputStream fos = new FileOutputStream("e:\\person.data");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(me);
      oos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
