import java.util.*;
public class Achievetarget
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the target number: ");
int target = input.nextInt();
System.out.println("How many numbers you want to enter");
int no=input.nextInt();
int []a=new int[no];
for(int i=0;i<a.length;i++)
{
System.out.println("Enter the numbers:");
a[i]=input.nextInt();
}
for(int j=0;j<a.length-1;j++)
{
for(int k=j+1;k<a.length;k++)
{
if(a[j]+a[k]==target)
{
System.out.println("by adding "+a[j]+" and "+a[k]+"which is equal to the target number");
}
}
}
}
}