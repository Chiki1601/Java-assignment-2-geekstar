// Write a program to print first x terms of the series 3n+2 which are not multiples of 4 in java

import java.util.Scanner;
class series
{
public static void main(String[] a)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=sc.nextInt();
int a=0;
for(int i=n; i<=n+20; i++)
{
a= 3*i+2;
if(a%4==0)
{
break;
}
System.out.println(a);
}
}
}