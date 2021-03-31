package 考前复习;

abstract class Vehicle {
  String kind, model;

  abstract void print();
}

class Bus extends Vehicle {
  int price;
  String name;

  Bus(int price, String name, String kind, String model) {
    this.price = price;
    this.name = name;
    this.kind = kind;
    this.model = model;
  }

  @Override
  void print() {
    System.out.println("price = " + price);
    System.out.println("name = " + name);
    System.out.println("kind = " + kind);
    System.out.println("model = " + model);
  }

  public static void main(String[] args) {
    Bus bus = new Bus(40, "layouwen", "ren", "phone");
    bus.print();
  }
}

