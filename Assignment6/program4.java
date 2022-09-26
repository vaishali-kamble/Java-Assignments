// write program to accept one number from user and count frequency of 4 in it.
import java.lang.*;
import java.util.*;

class Frequency
{
    private int num=0;
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
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
            if(iDigit == 4 )
            {
                iCnt++;
            }
            num = num / 10;
        }
        return iCnt;
        }
    }
}

public class program4
{
public static void main(String b[])
{
    Frequency fobj = new Frequency();
    fobj.Accept();
    fobj.Display();
    fobj.Frequencyfour();
}
}