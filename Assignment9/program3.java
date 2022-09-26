// Accept N numbers from user and check weather it contains 11 or not
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
        System.out.println("Enter the values of array");
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
     }

     public void Display()
     {
         int iCnt = 0;
         System.out.println("Values of array are");

         for(iCnt = 0; iCnt < Arr.length; iCnt++)
         {
            System.out.println(Arr[iCnt]);
         }
     }

     public boolean Displaynum()
     {
         int iCnt = 0; 
         boolean flag = false;
         
         for(iCnt = 0; iCnt < Arr.length; iCnt++)
         {
            if (Arr[iCnt]==11)
            {
                flag = true;
            }
         }        
         return flag;
     }

}

public class program3 {

    public static void main(String b[])
    {   

        Scanner sobj = new Scanner(System.in);

        int iLength = 0;
        boolean iRet;

        System.out.println("Enter the length of constructor");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);

        obj.Accept();
        obj.Display();

        iRet = obj.Displaynum();

        if(iRet==true)
        {
            System.out.println("It contains 11");
        }
        else
        {
            System.out.println("It does not contains 11");
        }

        obj = null;
    }
    
}

