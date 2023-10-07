import java.util.*;
class ExtractDigitFromString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        for(char dig:str.toCharArray())
        {
            if(Character.isDigit(dig))
            {
                System.out.println("The digit extracted from string is:"+dig);
            }
        }
    }
}