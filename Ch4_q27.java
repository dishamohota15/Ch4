/*Write a program to input twenty names in an array. Arrange these names in ascending order of letters, using the bubble sort technique.
Sample Input:
Rohit, Devesh, Indrani, Shivangi, Himanshu, Rishi, Piyush, Deepak, Abhishek, Kunal, .....
Sample Output:
Abhishek, Deepak, Devesh, Himanshu, Indrani, Kunal, Piyush, Rishi, Rohit, Shivangi, ....*/
import java.util.*;
class Ch4_q27
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name[]=new String[10];
		int i,j;
		String t="";
		System.out.println("Enter all 20 names one by one below ");
		for(i=0;i<20;i++)
		{
			name[i]=sc.nextLine();
		}
		
		for(i=0;i<20-1;i++)
		{	
			for(j=0;j<(20-1-i);j++)
			{
				if(name[j].compareTo(name[j+1])>0)
				{
				t=name[j];
				name[j]=name[j+1];
				name[j+1]=t;
				}
			}
		}
		System.out.println("Names after sorting in ascending order are : ");
		for(i=0;i<20;i++)
		{
			if(i<=18)
			System.out.print(name[i]+",");
			else
			System.out.print(name[i]);
		}
	}
}