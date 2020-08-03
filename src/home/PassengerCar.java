package home;


public class PassengerCar extends Car {

  private int capacity;
  private boolean back;


  PassengerCar() {
  }

  PassengerCar(String name, String formattedDate, int number, String colour, boolean moving,
      int capacity,
      boolean back) {
    super(name, formattedDate, number, colour, moving);
    this.capacity = capacity;
    this.back = back;
  }

  void getInCar() {
    System.out.println("Everyone in the car");
  }

  void getOffCar() {
    System.out.println("Everyone get off car");
  }

  @Override
  void toMove() {

    System.out.println("PassengerCar is moving");
  }

  @Override
  void toStop() {

    System.out.println("PassengerCar stopped");
  }

  @Override
  public void move() {
    System.out.println("PassengerCar start");
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public boolean isBack() {
    return back;
  }

  public void setBack(boolean back) {
    this.back = back;
  }
}
