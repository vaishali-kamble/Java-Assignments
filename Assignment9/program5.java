//Accept N number from user and accept one another number as No return frequency of No form it.
// N  : 6
// No : 66
// Elements : 85 66  3 66 93 88
// output : 2

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
    System.out.println("You have entered number");
    for(iCnt = 0; iCnt < Arr.length; iCnt++)
    {
    System.out.println(Arr[iCnt]);
    }
}

public int Search()
{
    int iNo= 0, iCnt=0 , ifrequency = 0;
    Scanner sobj = new Scanner(System.in);
    System.out.println("Please enter number to search the frequency of that number");
    iNo = sobj.nextInt();
    for(iCnt = 0; iCnt< Arr.length; iCnt++)
    {
    if (Arr[iCnt] == iNo)
    {
        ifrequency++;
    }
    }
    return ifrequency;
}

}

public class program5 {


    public static void main (String b[])
    {
        int iLength = 0, iRet= 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the value for constructor");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);

        obj.Accept();
        obj.Display();

        iRet = obj.Search();

        System.out.println("Frequency of entered number is "+iRet);
        
        obj = null;
    }
    
}
 