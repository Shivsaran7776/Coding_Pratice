package Arrays;
import java.util.*;
import java.io.*;
import java.util.Map.Entry;

class findDuplicates
{
    public static ArrayList<Integer> findDuplicate(int arr[],int n)
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        for(HashMap.Entry<Integer,Integer> e:hm.entrySet())
        {
            if(e.getValue()>1)
            {
                al.add(e.getKey());
            }
        }
        Collections.sort(al);
        if(al.size()==0)
        {
            al.add(-1);
            return al;
        }
        else
        {
            return al;
        }
    }
}
public class findDuplicatesInArray {
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int times;
        System.out.println("Enter the no.of times loop to iterate:");
        times = sc.nextInt();
        System.out.println("Enter the size of the array:");
        while(times>0)
        {
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            findDuplicates obj = new findDuplicates();
            ArrayList<Integer> res = obj.findDuplicate(arr,size);
            for(Integer i:res)
            {
                System.out.println(i);
            }
            times--;
        } 
        sc.close();       
    }
}
