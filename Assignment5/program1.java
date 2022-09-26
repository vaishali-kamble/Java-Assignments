// Write a program which accept one number from user display its multiplication of factor.

import java.lang.*;
import java.util.*;

class MultFactor{

    private int num;
    public void Accept()
    {
    Scanner sobj= new Scanner(System.in);

    System.out.println("Enter number");
    this.num=sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Multiplication Factor of number is "+num);
    }

    public int DisplayMultFactor()
    {
        int i=0;
        int imult=1;
        for(i=1;i<num;i++)
        {
        if((num%i)==0)
        {
            imult=imult*i;
        }
        }
        return imult;
    }
}

public class program1{

public static void main(String b[]) 
{
    MultFactor mfobj= new MultFactor();

    mfobj.Accept();
    mfobj.Display();
    mfobj.DisplayMultFactor();

    System.out.println(mfobj.DisplayMultFactor());
}
}