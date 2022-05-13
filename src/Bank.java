
abstract class centralBank{

    abstract float interest();
}

class ICICI extends centralBank{

    float interest(){
        return 4.5f;
    }
}

class HDFC extends centralBank{

    float interest(){
        return 5.5f;
    }
}

class SBI extends centralBank{

    float interest(){
        return 8.8f;
    }
}

public class Bank {

    public static void main(String[]args){

        centralBank b;

        b = new ICICI();

        System.out.println(b.interest());

        b = new HDFC();

        System.out.println(b.interest());

        b = new SBI();

        System.out.println(b.interest());


    }
}
