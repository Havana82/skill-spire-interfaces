public class Motorcycle extends Vehicle{
    Motorcycle(String model){
        super(model);
    }
    public void start(){
        String sentence ="The Motorcycle" + " " + this.model + " " +"is starting";
        System.out.println(sentence);
    }

    @Override
    public void stop() {
        String sentence = "The Motorcycle" + " " + this.model + " " + "is stopping";
        System.out.println(sentence);
    }

    public void honk(){
        String sentence ="The Motorcycle" + " " + this.model + " " + "is honking";
        System.out.println(sentence);
    }
}
