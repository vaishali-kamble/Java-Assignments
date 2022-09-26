//Accept N number from user and return frequency of 11 form it.

import java.lang.*;
import java.util.*;

class ArrayX{

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
        System.out.println("Values are");
        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int frequency()
    {
        int i = 0 , icnt = 0;
        for(icnt=0; icnt < Arr.length; icnt++)
        {
        if(Arr[icnt]==11)
        {
            i++;
        }
        } 
        return i;  
    }

}
public class program4 {
    
    public static void main (String b[])

    {
        Scanner sobj = new Scanner(System.in);
        
        int iLength = 0, iRet = 0; 

        System.out.println("Enter the size of array");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);

        obj.Accept();
        obj.Display();
        
        iRet = obj.frequency();

        System.out.println("Frequency of 11 "+iRet);
    }
}
