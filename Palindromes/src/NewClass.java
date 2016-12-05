
/**
 *
 * @author Nahid
 */
import java.util.Scanner;

public class NewClass 
{
    public static void main (String [] args)
    {
        Scanner scan  = new Scanner (System.in);
        System.out.println("Enter your word or phrase");
        String input  = scan.nextLine();
        
        if (isPalindrome(input)==true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static boolean isPalindrome(String str)
    {
        StringBuffer sb = new StringBuffer(str);      
        sb = sb.reverse();
        String rev = sb.toString();
        
        if (str.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
