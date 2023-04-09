import java.util.*;
public class Pentagonal
{
public static void main(String args[])
{
for(int i=1;i<=50;i++)
{
System.out.printf("%d  ",number(i));
}
}
public static int number(int i)
{
return (i*(3*i-1))/2;
}
}
