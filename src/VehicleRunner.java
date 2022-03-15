public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycle Trek = new Bicycle("Expensive", 2, 6);
    System.out.println(Trek.getName());
    System.out.println(Trek.getWheels());
    System.out.println(Trek.getGearCount());
    Trek.move(20);
    Trek.turn(-100);
    Trek.brake(0.20);
    Trek.ringBell();


    Subway N = new Subway("N train", 80, 8, 34, 100);
    N.getCarriages();
    N.getName();
    N.getWheels();
    N.getNumOfDelays();
    N.getNumOfRepair();
    N.move(10);
    N.turn(10);
    N.brake(100);








  }
}