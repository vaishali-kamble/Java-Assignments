// write program to accept one number from user and display its digits in reverse order
import java.lang.*;
import java.util.*;

class ReverseDig
{
    private int num=0;
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        this.num = sobj.nextInt();

    }
    public void Display()
    {
        System.out.println("Entered number is : "+this.num);
    }
    public void EvenCount()
    {
     {
        int iDigit=0;

        if(num<0)
        {
            num=-num;
        }
        while (num > 0)
        {
            iDigit = num % 10;
            System.out.println(+iDigit);
            num = num / 10;
        }
        
        }
    }
}

public class program2
{
public static void main(String b[])
{
    ReverseDig rdobj = new ReverseDig();
    rdobj.Accept();
    rdobj.Display();
    rdobj.EvenCount();

}
}