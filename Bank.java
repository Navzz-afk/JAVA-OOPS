import java.util.*;
import java.lang.*;
class Account{
String cust_Name;
String acc_Num;
String acc_type;
double amount;
Account(String name, String Num, String Type, double amount)
{

cust_Name=name;
 acc_Num=Num;
 acc_type=Type;
this.amount=amount;
}

}

class Cur_acct extends Account{

Cur_acct(String name, String Num, String Type,double amount)
{
super(name,Num,Type,amount);
}

void Deposit(double amt){
amount=amount+amt;
System.out.println("Deposited successfuly");
System.out.println("New Balance is "+amount);
}

void wihtdraw(double amt)
{

	amount=amount-amt;
	if(amount<10000){
		System.out.println("Minimum Balance Exeeded. Imposing penaty of Rs.500");
		System.out.println("New Balance is "+amount);
	}
	else
	System.out.println("New Balance is "+amount);
}

void CheckbookFac(){System.out.println("Checkbook Facility available");}

void display()
{
System.out.println("Balance is "+amount);
}


}


class Sav_acct extends Account{

Sav_acct(String name, String Num, String Type,double amount)
{
super(name,Num,Type,amount);
}

void Deposit(double amt){
amount=amount+amt;
System.out.println("Deposited successfuly");
System.out.println("New Balance is "+amount);
}

void wihtdraw(double amt)
{

	amount=amount-amt;

}

void Compound(double principle, double time, double n,double rate)
{	
	double p=principle; double t=time; double f=n; double r=rate;
	double CI=(p*(Math.pow((1+(r/f)),f*t)))-p;
	System.out.println("The total interst for inputed frequency,rate and time is :"+CI);
	double tenure=CI+amount;
	System.out.println("Total amount after the tenure :"+tenure);
}

void display()
{
System.out.println("Balance is "+amount);
}

}


class Bank{
public static void main(String args[])
{

	Cur_acct Navneet_Curr = new Cur_acct("Navneet","208","Current",100000);
	Sav_acct Navneet_Sav = new Sav_acct("Navneet","208","Savings",100000);

	Navneet_Sav.Deposit(10000);
	System.out.println();
	System.out.println();
	
	Navneet_Sav.wihtdraw(1000);
System.out.println();
System.out.println();

	Navneet_Sav.Compound(10000,1,2,1);
System.out.println();
System.out.println();
	Navneet_Curr.Deposit(10000);
System.out.println();
System.out.println();
	Navneet_Curr.wihtdraw(10000);

}

}
