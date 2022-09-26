// Accept n numbers from user and return difference between  summation of even elements and odd elements.
// N : 6
// Elements: 85 66 3 80 93 88
// 53 (234-181)

import java.lang.*;
import java.util.*;

class ArrayX
{
    private int Arr[];

    public ArrayX(int iNo)
    {
        Arr = new int[iNo];
    }

    public void Accept()
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the values : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        
        System.out.println("Elements of array are : ");
        for(iCnt = 0; iCnt< Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int Diffevenodd()
    {
        int ifrequency=0, even=0,odd=0,iCnt=0;
        for(iCnt = 0; iCnt< Arr.length; iCnt++)
        {
        if((Arr[iCnt]%2)==0)
        {
            even = even + Arr[iCnt];
        }
        else
        {
            odd = odd +Arr[iCnt];
        }
        ifrequency = even-odd;
    }
    return ifrequency;
    }
}

class program2

{
    public static void main(String arg[])
    {
            Scanner sobj = new Scanner(System.in);
            int iLength = 0, iRet =0;

            System.out.println("Enter the value for constructor");
            iLength = sobj.nextInt();

            ArrayX obj = new ArrayX(iLength);

            obj.Accept();
            obj.Display();

            iRet = obj.Diffevenodd();
            System.out.println(+iRet);

            obj = null;
    }
}