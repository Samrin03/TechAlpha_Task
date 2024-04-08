import java.util.*;
class Task3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array size:");
int n=sc.nextInt();
System.out.println("enter d value:");
int d=sc.nextInt();
System.out.println("enter array elements:");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Array elements are:");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
if(d>n)
{
d=d%n;
}
int b[]=new int[d];
for(int i=0;i<d;i++)
{
b[i]=a[i];
}
for(int i=d;i<n;i++)
{
a[i-d]=a[i];
}
int j=0;
for(int i=n-d;i<n;i++)
{
a[i]=b[j];
j++;
}
System.out.println("After Left d Shifting of an array elements:");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}




