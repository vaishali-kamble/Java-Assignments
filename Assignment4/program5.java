// Write a program which accept one number from user and return difference between summation ofits factors and non factors.

import java.lang.*;
import java.util.*;

class SumfactNonFact{

    private int num;
    public void Accept()
    {
    Scanner sobj= new Scanner(System.in);

    System.out.println("Enter number");
    this.num=sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Number is "+num);
    }

    public int DisplaySum()
    {
        int i=0;
        int idiff=0;
        int ifact=0;
        int inonfact=0;

        for(i=1;i<num;i++)
        {
        if((num%i)!=0)
        {
          inonfact=inonfact+i;
        }
        else
        {
         ifact=ifact+i;
        }
        }
        idiff=ifact-inonfact;
        return idiff;
    }
    
}

public class program5{

public static void main(String b[]) 
{
    SumfactNonFact nfobj= new SumfactNonFact();

    nfobj.Accept();
    nfobj.Display();
    nfobj.DisplaySum();

    System.out.println("Difference between summation of its factors and  non factors"+nfobj.DisplaySum());
}
}