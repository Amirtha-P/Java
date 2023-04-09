import java.util.*;
public class Futureinvestment14
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the investment amount: ");
double p=input.nextDouble();
System.out.println("enter the interest rate: ");
double ar=input.nextDouble();
System.out.println("Enter the year: ");
int y=input.nextInt();
double mr=ar/1200;
Check x=new Check();
x.display(p,mr,i);
System.out.printf("YEARS\t FUTURE_VALUE\n");
for(int i=1;i<=y;i++)
{
System.out.printf("%d\t%f\n",i,a);
}
}
}
class Check
{
void display(double p,double mr,int i)
{
int a= p * Math.pow(1+mr,i*12);
}

}

