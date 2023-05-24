/*Write a program to accept 10 names in a Single Dimensional Array (SDA). Display the names whose first
letter matches with the letter entered by the user.

Sample Input:
Aman Shahi
Akash Gupta
Suman Mishra
and so on ..........

Sample Output:
Enter the alphabet: A
Aman Shahi
Akash Gupta
.....
.....*/
import java.util.*;
class Ch4_q26b{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name[] = new String[10];
		System.out.println("Enter 10 names: ");
        for(int i=0;i<10;i++){
            name[i]=in.nextLine();
		}
		System.out.print("Enter a letter: ");
		char ch=in.next().charAt(0);
		char fchar;
		int count=0;
		for(int i=0;i<10;i++){
			fchar=name[i].charAt(0);
			if(fchar==ch){
				System.out.println(name[i]);
				count=1;
			}
		}
		if(count==0)
			System.out.println("Name not found");
	}
}
			