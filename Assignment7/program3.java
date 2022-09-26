// write program to accept one number from user and return the count of digits in between 3 and 7.
import java.lang.*;
import java.util.*;

class CountFrequency
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
    public int Count()
    {
     {
        int iDigit=0,iCnt=0;

        if(num<0)
        {
            num=-num;
        }
        while (num > 0)
        {
            iDigit = num % 10;
            if((iDigit==6) || (iDigit==5) || (iDigit==4))
            {
            iCnt++;
            }
            num = num / 10;
        }
        return iCnt;
        }
        
    }
}

public class program3
{
public static void main(String b[])
{
    CountFrequency cobj = new CountFrequency();
    int iRet=0;
    cobj.Accept();
    cobj.Display();
    iRet = cobj.Count();

    System.out.println("Frequency count"+iRet);

}
}