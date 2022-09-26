// write program toto accept one number from user and count frequency of even digits.
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
    public int EvenCount()
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
            if(iDigit % 2 == 0)
            {
                iCnt++;
            }
            num = num / 10;
        }
        return iCnt;
        }
    }
}

public class program1
{
public static void main(String b[])
{
    CountFrequency cfobj = new CountFrequency();
    int iRet=0;

    cfobj.Accept();
    cfobj.Display();
    iRet = cfobj.EvenCount();

    System.out.println("frequency of even digits are :"+iRet);

}
}