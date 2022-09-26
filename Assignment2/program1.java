// Used to Accept one number from user and print that number * on screen
import java.lang.*;
import java.util.*;

class DisplayStar
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
       int i = 0;
       for(i=1; i<=num;i++)
       {
           System.out.println("*");
       }
    }
}
public class program5{

    public static void main(String b[])
    {
        DisplayStar cobj = new DisplayStar();

        cobj.Accept();
        cobj.Display();

        cobj.Displaynum();
    }
}