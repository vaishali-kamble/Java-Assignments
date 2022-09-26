// Write a program which accept one number from user and return summation of non factors.

import java.lang.*;
import java.util.*;

class SumNonFactor{

    private int num;
    public void Accept()
    {
    Scanner sobj= new Scanner(System.in);

    System.out.println("Enter number");
    this.num=sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Summation of non factor number of "+num+"is");
    }

    public int DisplayNonFactor()
    {
        int i=0;
        int isum=0;
        for(i=1;i<num;i++)
        {
        if((num%i)!=0)
        {
         isum=isum+i;
        }
        }
        return isum;
    }
}

public class program4{

public static void main(String b[]) 
{
    SumNonFactor nfobj= new SumNonFactor();

    nfobj.Accept();
    nfobj.Display();
    nfobj.DisplayNonFactor();

    System.out.println(nfobj.DisplayNonFactor());
}
}