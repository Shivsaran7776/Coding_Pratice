// 1,if the character is an uppercase alphabet(A - Z)
// 0, if the character is a lowercase alphabet(a - z)
// -1, if the character is not an alphabet

import java.util.*;
public class Find_Character_Case {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = s.charAt(0);
        sc.close();
        if(ch>='A' && ch<='Z')
        {
            System.out.println(1);
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(-1);
        }
    }
}