// Write a program which accept one number from user display its non factors.

import java.lang.*;
import java.util.*;

class NonFactor{

    private int num;
    public void Accept()
    {
    Scanner sobj= new Scanner(System.in);

    System.out.println("Enter number");
    this.num=sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Non Factor of number  "+num);
    }

    public void DisplayNonFactor()
    {
        int i=0;
        for(i=1;i<num;i++)
        {
        if((num%i)!=0)
        {
         System.out.println(+i);
        }
        }
        
    }
}

public class program3{

public static void main(String b[]) 
{
    NonFactor nfobj= new NonFactor();

    nfobj.Accept();
    nfobj.Display();
    nfobj.DisplayNonFactor();

}
}