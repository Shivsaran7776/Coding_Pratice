// There are 2 choices in the menu:

// Choice 1 is to find area of the circle having a radius 'r'.abstract
// Choice 2 is to find the area of the rectangle having dimensions 'l' and 'b'.class

// You are given the choice 'ch' and an array 'a'

// if 'ch' is 1 'a' contains a single number 'r'.If 'ch' is 2,'a' contains 2 number,'l' and 'b'.

import java.util.*;
public class Switch_Case_St {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        double arr[] = new double[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextDouble();
        }
        System.out.println(areaSwitchCase(size,arr));
    }
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        switch(ch)
        {
            case 1:
            return Math.PI *a[0]*a[0];

            case 2:
            return a[0]*a[1];

            default:
            return -1;
        }
    }
}