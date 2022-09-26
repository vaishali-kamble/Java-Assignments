//  Output :   enter the character
//              A
//              a   

import java.lang.*;
import java.util.*;

class Vowel
{
    private char cname;

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

    void DisplayVowel()

    {   
        
        if (cname=='A'||cname=='E'||cname=='I'||cname=='O'||cname=='U'||cname =='a'||cname=='e'||cname=='i'||cname=='o'||cname=='u')
        {
           
            System.out.println(cname + "  is Vowel");
        }
        else 
        {

            System.out.println(cname + "  is not Vowel");
        }
    }
}

public class program5{

    public static void main(String b[])
    {
        Vowel cobj = new Vowel();

        cobj.Accept();
        cobj.Display();

        cobj.DisplayVowel();
    }
}