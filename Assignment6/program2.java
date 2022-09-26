//Used to accept one number from user and check whether it contain zero or not.
import java.lang.*;
import java.util.*;

class CheckZero
{
    private int num;
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        this.num = sobj.nextInt();
    }

    public void Display()
    {
        System.out.println(+this.num);
    }

    public boolean DisplayChkZero()
    {
        int iDigit=0;

    if(num<0)
    {
        num=-num;
    }
    while (num > 0)
    {
        iDigit= num % 10;
        if((iDigit==0))
        {
            return true;

        }
        num = num / 10;
    }
    
    return false;
    }
}

public class program2 {

    public static void main(String b[])
    {
        CheckZero czobj = new CheckZero();
        boolean bRet;
        czobj.Accept();
        czobj.Display();
        bRet = czobj.DisplayChkZero();    

    if(bRet==true)
    {
        System.out.println("It contains zero");
    }
    else
    {
        System.out.println("It does not contains zero");
    }
    }
}
