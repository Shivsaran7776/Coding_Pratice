import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String word = "";
            word += sc.next();
            al.add(word);
        }
        sc.close();
        for(String i:al)
        {
            System.out.println(i);
        }
    }
}