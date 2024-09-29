public abstract class Vehicle implements Drivable {
    protected String model;

    Vehicle(String model){
        this.model = model;
    }

    abstract void honk();

}

