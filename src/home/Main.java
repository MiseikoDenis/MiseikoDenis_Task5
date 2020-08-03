package home;

public class Main {

  public static void main(String[] args) {

    PassengerCar passengerCar = new PassengerCar("MAZDA", "24/08/1995", 223453,
        "blue", true, 4, true);
    System.out.println(
        passengerCar.getName() + " " + passengerCar.getFormattedDate() + " " + passengerCar
            .getNumber() + " " + passengerCar.getColour() + "\n This car is moving: " + passengerCar
            .isMoving() + "\n It can take " + passengerCar.getCapacity()
            + " people \n And this car have back: " + passengerCar.isBack());

    Truck truck = new Truck("Belaz", "11/01/1990", 234212,
        "yellow", true, 400);
    System.out.println(truck.getName() + " " + truck.getFormattedDate() + " " + truck.getNumber() +
        " " + truck.getColour() + "\n This car is moving: " + truck.isMoving() + " " +
        " And this car can take: " + truck.getWeight());
    truck.move();

    Bicycle bicycle = new Bicycle(54.5, 4);
    System.out.println(
        "Bycycle have diameter of wheels : " + bicycle.dWeels + " and " + bicycle.lights
            + " lights");

    Motorcycle motorcycle = new Motorcycle(200, "green");
    System.out.println(
        "Motorcycle can achieve " + motorcycle.maxSpeed + "km/h and it is " + motorcycle.colour
            + "!");
  }
}
