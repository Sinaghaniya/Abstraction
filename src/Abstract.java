
abstract class Bike1{

    Bike1(){
        System.out.println("Starts the Bike");
    }

    abstract void run();

    void change(){
        System.out.println("Changed Gear Successfully");
    }

}

class honda extends Bike1{

    void run(){
        System.out.println("Running Safely");
    }
}

public class Abstract {

    public static void main(String[]args){

        Bike1 b = new honda();

        b.run();

        b.change();
    }
}
