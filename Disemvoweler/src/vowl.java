
import java.util.Scanner;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahid
 */
public class vowl 
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String words = "";
        System.out.println("Enter your word.");
        words = scan.nextLine();
        System.out.println(removeVowel(words));
        System.out.println(getVowelRemoved(words));
    }
    public static String removeVowel (String w)
    {   
        w = w.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "").replace("y", "").replace(" ", "");  
        
        return w;
    }
        
    public static String getVowelRemoved (String w)
    {
        String replacedVowel = "";
        for (int i = 0; i<=w.length()-1; i++)
        {
            char letter = w.charAt(i);
            if (letter== 'a')
            {
                replacedVowel += "a";
            }
            if (letter== 'e')
            {
                replacedVowel += "e";
            }
            if (letter== 'i')
            {
                replacedVowel += "i";
            }
            if (letter== 'o')
            {
                replacedVowel += "o";
            }
            if (letter== 'u')
            {
                replacedVowel += "u";
            }
            if (letter== 'y')
            {
                replacedVowel += "y";
            }
        }
        return replacedVowel;
    }
}

