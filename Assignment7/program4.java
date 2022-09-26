// Write a program to accept one number from user and return multiplication of all digits.
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
        int iDigit=0,imult=1;

        if(num<0)
        {
            num=-num;
        }
        while (num > 0)
        {
            iDigit = num % 10;
            imult= imult* iDigit;
            num = num / 10;
        }
        return imult;
        }
        
    }
}

public class program4
{
public static void main(String b[])
{
    CountFrequency cobj = new CountFrequency();
    int iRet=0;
    cobj.Accept();
    cobj.Display();
    iRet = cobj.Count();

    System.out.println("Multiplication of factor is"+iRet);

}
}