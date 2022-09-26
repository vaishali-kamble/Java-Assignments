// Write a program Used to accept one number from user and return difference between summation of even and odd digits.
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
        int iDigit=0,even=0, odd=0,idiff=0;

        if(num<0)
        {
            num=-num;
        }
        while (num > 0)
        {
            iDigit = num % 10;
            if((num%2)==0)
            {
               even=even+iDigit; 
            }
            else{
                odd=odd+iDigit;
            }
            num = num / 10;
        }
        idiff=even-odd;
        return idiff;
        }
        
    }
}

public class program5
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