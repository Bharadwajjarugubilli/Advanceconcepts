public class Mainclass {

    public static void main(String Args[]) throws customExceptions,Exception{
        Singleton obj1=Singleton.getInstance();
        obj1.name="Shyam";
        obj1.id=1;
        Singleton obj2=Singleton.getInstance();
        System.out.println(obj2.name);
try
{
    int h=7;
    int j=0;
    if(j==0){

        throw new customExceptions("divison  by zero!");
    }



}
catch (ArithmeticException e1){

    System.out.println(e1.getMessage());
}
catch (customExceptions e){

    System.out.println("Error "+e.getMessage());
}
    }
}
