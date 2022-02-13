// java program to find sum of even and odd numbers


import java.util.Scanner;

public class Main1
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int count = 0;
for(int i=1; count<n;i++)
{
int ap = 3*i+2;
if(ap%4!=0)
{
System.out.print(ap+" ");
count++;
}

}

}

}