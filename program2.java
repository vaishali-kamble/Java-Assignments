// Program to display  1 to 5 on screen

import java.lang.*;
import java.util.*;

class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number : ");
        this.iNo = sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Value is : "+this.iNo);
    }

    public void DisplayNumber()
    {
        int iCnt= 0;

        for(iCnt=1; iCnt<=5; iCnt++)
        {
            System.out.println("Marvellous");
        }
    }
}

class program2
{
    public static void main(String b[])
    {
            Number nobj = new Number();

            nobj.Accept();
            nobj.Display();

            nobj.DisplayNumber();
    }
}