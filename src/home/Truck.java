package home;


public class Truck extends Car {

  private int weight;

  Truck() {
  }

  Truck(String name, String formattedDate, int number, String colour, boolean moving, int weight) {
    super(name, formattedDate, number, colour, moving);
    this.weight = weight;

  }

  void getOffBack() {
    System.out.println("Back is dropped");
  }

  void getOnBack() {
    System.out.println("Got back on board");
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public void toMove() {
    System.out.println("Truck is moving");
  }

  @Override
  public void toStop() {
    System.out.println("Truck stopped");
  }

  @Override
  public void move() {
    System.out.println("Truck start");
  }
}
