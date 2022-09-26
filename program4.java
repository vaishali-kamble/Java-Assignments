// Used to Accept one number and check weather it is divisible by5 or not
import java.lang.*;
import java.util.*;

class Check
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

    public void Checknum()
    {   
        if((num%5)==0)
        {
            System.out.println("is divisible by 5" );
        }
        else
        {
            System.out.println( "is not divisible by 5");
        }

    }
}
public class program4 {

    public static void main(String b[])
    {
        Check cobj = new Check();

        cobj.Accept();
        cobj.Display();

        cobj.Checknum();
    }
}