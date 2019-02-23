//  4. WAP to create singleton class.

package Java2;

public class Question4 {


    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        //Singleton obj2 = new Singleton( );
        obj.demoMethod();
    }
}


class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }


    public static Singleton getInstance() {
        return singleton;
    }


    protected static void demoMethod() {
        System.out.println("demoMethod for singleton");
    }
}
