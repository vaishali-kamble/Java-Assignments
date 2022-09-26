//  Output :   enter the number
//              7
//              2   4   6   8   10   12   14   

import java.lang.*;
import java.util.*;

class Even
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
            System.out.println(+i*2);
        }
       }
    }

public class program1{

    public static void main(String b[])
    {
        Even cobj = new Even();

        cobj.Accept();
        cobj.Display();

        cobj.Displaynum();
    }
}