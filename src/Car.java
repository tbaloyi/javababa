public class Car {
    String make;
    String design;

    public void Vehicle (){
        make = "Ford";
        design = "Sports";

        System.out.println("The design of the car is " + design);
        System.out.println("The car is a " + make);

    }


    public static void main(String[] args) {
        Car car = new Car();
        car.Vehicle();

        }

}
