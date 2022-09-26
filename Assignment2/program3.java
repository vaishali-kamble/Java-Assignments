// used to accept one number from user if number is less than 10 then print "Hello "on screen
import java.lang.*;
import java.util.*;

class Print
{
    private int num;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println(" Enter number ");
        this.num = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Value is : "+this.num);
    }

    public void Displaynum()
    {   
       
       if(num<10)
       {
           System.out.println("Hello");
       }
       else{
        System.out.println("Demo");
   
       }
    }
}
public class program3{

    public static void main(String b[])
    {
        Print cobj = new Print();

        cobj.Accept();
        cobj.Display();

        cobj.Displaynum();
    }
}