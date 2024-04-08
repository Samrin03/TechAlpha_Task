import java.util.*;
class Task4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value along with zeros:");
String s=sc.nextLine();
int n=0;
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
int a=Character.getNumericValue(c);
if(a!=0)
{
 n=n*10+a;
}
}
System.out.println("value after removing zeros:");
System.out.println(n);
}
}