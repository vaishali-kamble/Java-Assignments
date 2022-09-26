// Used to Accept one number from user and print that number * on screen using while loop
import java.lang.*;
import java.util.*;

class Star
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
       
       while(num>0)
       {
           System.out.println("*");
           num--;
       }
    }
}
public class program2{

    public static void main(String b[])
    {
        Star cobj = new Star();

        cobj.Accept();
        cobj.Display();

        cobj.Displaynum();
    }
}