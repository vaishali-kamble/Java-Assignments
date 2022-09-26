//Used to accept one number from user and display its digits in reverse order
import java.lang.*;
import java.util.*;

class DisplayDigit
{
    private int num;
    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        this.num= sobj.nextInt();
    }
    public void Display()   
    {
        System.out.println("Number is "+num);
    }

    public void DisplayDigRev()
    {
        int digit=0;

        if(num<0)
        {
            num=-num;
        }
        while(num > 0)
        {
            digit = num % 10;
            System.out.println(+digit);
            num = num / 10;
        }
    }
}

public class program1{
public static void main(String b[])
{
    DisplayDigit dobj = new DisplayDigit();
    dobj.Accept();
    dobj.Display();
    dobj.DisplayDigRev();

}


}