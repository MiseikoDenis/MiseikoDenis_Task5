package home;

public class Bicycle implements Movable {

  double dWeels;
  int lights;


  Bicycle(double dWeels, int lights) {
    this.dWeels = dWeels;
    this.lights = lights;
  }

  @Override
  public void move() {
    System.out.println("Bicycle is moving");
  }
}
