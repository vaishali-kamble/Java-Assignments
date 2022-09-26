//Write a program which accept one number from user and display its factors in decreasing order..

import java.lang.*;
import java.util.*;

class FactRev
{   
    private int num=0,i=0;
    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number");
        this.num=sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Number is "+this.num);
    }

    public void DisplayFactRev()
    {
        for(i=num/2;i>=1;i--)
        {
        if((num%i)==0)
        {
            System.out.println("Factors in decreasing order are"+i);
        }
        }
    }

}

public class program2
{

    public static void main(String b[])
    {
        FactRev frobj=new FactRev();

        frobj.Accept();
        frobj.Display();
        frobj.DisplayFactRev();
    }
}