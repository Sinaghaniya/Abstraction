
abstract class Bike{

    abstract void run();
}

class Ninja extends Bike{

    void run(){
        System.out.println("Frikkin 400");
    }
}

public class Abstraction1 {

    public static void main(String[]args){

        Bike b = new Ninja();

        b.run();


    }

}
