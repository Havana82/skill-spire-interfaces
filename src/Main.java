public class Main {
    public static void main(String[] args) {
        Car mycar = new Car("Tesla");
        mycar.start();
        mycar.honk();
        mycar.stop();

        Motorcycle myMotorcycle = new Motorcycle("Honda");

        myMotorcycle.start();
        myMotorcycle.honk();
        myMotorcycle.stop();
    }
}