public class Singleton {
    int id;
    String name;


    public static Singleton obj=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){

       return obj;

    }
}
