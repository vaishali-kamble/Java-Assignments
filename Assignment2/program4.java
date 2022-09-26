// used to
import java.lang.*;
import java.util.*;

class Frequency
{
    private int num1;
    private int num2;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println(" Enter first number ");
        this.num1 = sobj.nextInt();
        System.out.println(" Enter second number ");
        this.num2 = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Value is : "+this.num1);
    }

    public void Displaynum()
    {   
        int i=0;
        for(i=0;i<num2;i++)
        {
            System.out.println(+num1);
        }
        
       }
    }

public class program4{

    public static void main(String b[])
    {
        Frequency cobj = new Frequency();

        cobj.Accept();
        cobj.Display();

        cobj.Displaynum();
    }
}