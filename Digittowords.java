import java.util.*;
public class Digittowords
{
public static void main(String args[])
{
int r,n,num;
String digitwords=" ";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
n=sc.nextInt();
num=n;
while(num>0)
{
r=num%10;
switch(r)
{
case 0:
digitwords=" zero "+digitwords;
break;
case 1:
digitwords=" one "+digitwords;
break;
case 2:
digitwords=" two "+digitwords;
break;
case 3:
digitwords=" three "+digitwords;
break;
case 4:
digitwords=" four "+digitwords;
break;
case 5:
digitwords=" five "+digitwords;
break;
case 6:
digitwords=" six "+digitwords;
break;
case 7:
digitwords=" seven "+digitwords;
break;
case 8:
digitwords=" eight"+digitwords;
break;
case 9:
digitwords=" nine "+digitwords;
break;
}
num=num/10;
}
String a=digitwords;
Print x=new Print();
x.display(a);
}
}
class Print
{
void display(String a)
{
System.out.println("The number is converted to string "+a);
}
}