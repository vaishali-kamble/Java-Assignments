//  Output :   enter the number
//              7
//              2   4   6   8   10   12   14   

import java.lang.*;
import java.util.*;

class Evenno
{
    private int num1;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println(" Enter number ");
        this.num1 = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Value is : "+this.num1);
    }

    public void Displaynum()
    {   
        int i = 0;
        for(i=1; i<=num1;i++)
        {
            if(((i%2)==0)&& (num1%i)==0)
            System.out.println(+i);
        }
       }
    }

public class program3{

    public static void main(String b[])
    {
        Evenno cobj = new Evenno();

        cobj.Accept();
        cobj.Display();

        cobj.Displaynum();
    }
}