import java.util.*;
import java.lang.Math;
class Quadratic{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter values A,B,C from quadratic equation Ax^2+Bx+C=0");
System.out.println("Enter A");
double root1,root2;
double A=sc.nextDouble();
System.out.println("Enter B");
double B=sc.nextDouble();
System.out.println("Enter C");
double C=sc.nextDouble();
double D=B*B-4*A*C;
if(D<0)
	{
		System.out.println("Roots are imaginary, they are:");
		root1=-B/(2*A);
		root2=Math.sqrt(-D)/(2*A);
		System.out.println(root1+"+"+root2+"i");
		System.out.println(root1+"-"+root2+"i");
	}
else if(D==0)
	{
		System.out.println("Roots are real and equal");
		System.out.println("Root is"+(-B/(2*A)));
	}
else
	{
		System.out.println("Roots are real and unequal");
		System.out.println("Roots are:");
		root1=-B/(2*A);
		root2=Math.sqrt(D)/(2*A);
		System.out.println(root1+root2);
		System.out.println(root1-root2);
	}
}
}
		