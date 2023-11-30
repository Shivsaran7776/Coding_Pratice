import java.util.*;
class RepeatedIDs
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long size = sc.nextInt();
        long array[] = new long[(int) size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        RemoveId obj = new RemoveId();
        long arr[] = obj.uniqueId(array,size);
        StringBuilder sb = new StringBuilder();
        for(long i:arr)
        {
            sb.append(i+" ");
        }
        System.out.println(sb);
        sc.close();
    }
}
class RemoveId
{
    public long[] uniqueId(long arr[],long n)
    {
        ArrayList<Long> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!(al.contains(arr[i])))
            {
                al.add(arr[i]);
            }
        }
        long arr2[] = new long[(int)al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr2[i] = al.get(i);
        }
        return arr2;
    }
}