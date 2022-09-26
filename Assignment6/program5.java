// write program toto accept one number from user and count frequency of such a digits which are less than 6.
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
    public int Frequencyfour()
    {
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
            if(iDigit <=5 )
            {
                iCnt++;
            }
            num = num / 10;
        }
        return iCnt;
        }
    }
}

public class program5
{
public static void main(String b[])
{
    CountFrequency cfobj = new CountFrequency();
    int iRet=0;

    cfobj.Accept();
    cfobj.Display();
    iRet = cfobj.Frequencyfour();

    System.out.println("frequency of digits which are less than 6:"+iRet);

}
}