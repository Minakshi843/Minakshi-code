import java.util.*;
class Overloading
{
    void show ()
    {
        System.out.println("1");                //without arg
    }
    void show(int a)
    {
        System.out.println(a);                  // with int single arg
    }
    void show(int a,int b)
    {
        System.out.println(b);                  // with double same int arg
    }
    void show (String a)
    {
        System.out.println(a);                  //with String single arg
    }
    void show (String a,int b)
    {
        System.out.println(a+" " +b);           // with double string and int 
    }
    void show (int a,String b)
    {
        System.out.println(a+" "+b);            // with doublr int and string (sequence change )
    }
    int method(int a)
    {   
        return a;                               // different method in overloading 
    }
    public static void main(int a)
    {
        System.out.println("main method's return = "+a);        //we can overload mainh method
    }
    public static void main(String[] args)
    { 
      Overloading p = new Overloading ();
        p.show();
        p.show(30);
        p.show(20);
        p.show("MAHI");
        p.show("priya",23);
        p.show(20,"Mahi");
        int c= p.method(45);
        System.out.println(c);
        p.main(20);
       
    }
}