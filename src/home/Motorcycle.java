package home;

public class Motorcycle implements Movable{
int maxSpeed;
String colour;

Motorcycle(int maxSpeed, String colour){
  this.maxSpeed = maxSpeed;
  this.colour = colour;
  }

  @Override
  public void move() {
    System.out.println("Motorcycle is moving");
  }
}
