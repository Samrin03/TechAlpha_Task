import java.util.*;
import java.util.HashSet;
public class Task1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter array elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
         System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print("]");
        System.out.println();
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            st.add(a[i]);
        }
        System.out.println("After removing duplicates from the List");
        System.out.print("[");
        for(int ob:st)
        {
            System.out.print(ob+",");
        }
        System.out.print("]");
    }
}
