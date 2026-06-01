import java.util.Scanner;
class largest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
System.out.println("Enter a number:");
int b=sc.nextInt();
if(a>b)
{
System.out.println("first number is bigger");
}
else if(b>a)
{
System.out.println("second number is bigger");
}
else
{
System.out.println("smaller");
}
}
}
