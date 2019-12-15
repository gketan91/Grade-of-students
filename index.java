
 
Practical no:1d
import java.io.*;
import java.util.*;
class result
{
	public static void main (String args[])
	{
		int mark1,mark2,mark3,avg;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 subject marks");
		mark1=sc.nextInt();	
		mark2=sc.nextInt();
		mark3=sc.nextInt();
		avg=(mark1+mark2+mark3)/3;   //taking average of marks to calculate the grade.
		if(avg>=0 && avg<=39)          //average range from 0 to 39
		{
			System.out.println("E Grade");
		}
		else if(avg>=40 && avg<=49)           //average range from 40 to 49
		{
			System.out.println("D Grade");
		}
		else if(avg>=50 && avg<=69)            //average range from 50 to 69
		{
			System.out.println("C Grade");
		}
		else if(avg>=70 && avg<=79)           //average range from 70 to 79
		{
			System.out.println("B Grade");
		}
		else
		{
			System.out.println("A Grade");            //average range from 80 to 100
		}
	}
}
