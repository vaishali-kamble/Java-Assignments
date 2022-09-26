//  Output :   enter the character
//              A
//              a   

import java.lang.*;
import java.util.*;

class Convert
{
    private char cname, cname2;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println(" Enter character ");
        this.cname = sobj.next().charAt(0);
    }
    public void Display()
    {
        System.out.println("Character is : "+this.cname);
    }

    void DisplayConvert()

    {   
        
        if (cname>='A'&& cname<='Z')
        {
            cname2=Character.toLowerCase(cname);
            System.out.println("Lowercase is : "+cname2);
        }
        else 
        {cname2=Character.toUpperCase(cname);

            System.out.println("Character is : "+cname2);
        }
    }
}

public class program4{

    public static void main(String b[])
    {
        Convert cobj = new Convert();

        cobj.Accept();
        cobj.Display();

        cobj.DisplayConvert();
    }
}