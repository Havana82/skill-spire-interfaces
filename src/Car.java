public class Car extends Vehicle {

    Car(String model){
        super(model);
    }
    public void start(){
        String sentence ="The Car" + " " + this.model + " " +"is starting";
        System.out.println(sentence);
    }

    @Override
    public void stop() {
        String sentence = "The Car" + " " + this.model + " " + "is stopping";
        System.out.println(sentence);
    }

    public void honk(){
        String sentence ="The Car" + " " + this.model + " " + "is honking";
        System.out.println(sentence);
    }

}