// used to
import java.lang.*;
import java.util.*;

class EvenorOdd
{
    private int num1;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println(" Enter number ");
        this.num1 = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Value is : "+this.num1);
    }

    public void Displaynum()
    {   
        if((num1%2)==0)
        {
            System.out.println("This is Even number");
        }
        else{
            System.out.println("This is odd number"); 
        }
       }
    }

public class program5{

    public static void main(String b[])
    {
        EvenorOdd cobj = new EvenorOdd();

        cobj.Accept();
        cobj.Display();

        cobj.Displaynum();
    }
}