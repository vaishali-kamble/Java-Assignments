//Used to to accept one number from user and count frequency of two in it.
import java.lang.*;
import java.util.*;

class CountTwo
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

    public int DisplayCountTwo()
    {
        int iDigit=0;
        int iCnt=0;

    if(num<0)
    {
        num=-num;
    }
    while (num > 0)
    {
        iDigit = num % 10;
        if(iDigit == 2)
        {
            iCnt++;
        }
        num = num / 10;
    }
    
    return iCnt;
    }
}

public class program3 {

    public static void main(String b[])
    {
        CountTwo czobj = new CountTwo();
        int iRet=0;
        czobj.Accept();
        czobj.Display();
        iRet = czobj.DisplayCountTwo();

        System.out.println("Frequency of 2 is "+iRet);
    }
    
}
