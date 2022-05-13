
interface A{

    void a();
    void b();
    void c();
    void d();
}

abstract class lost implements A{

     public void a(){
     System.out.println("I am A");
    }
}

class found  extends lost{

    public void b(){
        System.out.println("I am b");
    }

    public void c(){
        System.out.println("I am c");
    }

    public void d(){
        System.out.println("I am d");
    }
}

public class AbsWithintertface {

    public static void main(String[]args){

        A a = new found();

        a.a();
        a.b();
        a.c();
        a.d();
    }
}
