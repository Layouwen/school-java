package 考前复习;

import java.io.*;

public class Demo23 {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("src/考前复习/Demo23.java");
      InputStreamReader dis = new InputStreamReader(fis);
      BufferedReader reader = new BufferedReader(dis);
      String s;
      while ((s = reader.readLine()) != null) {
        System.out.println("read:" + s);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
