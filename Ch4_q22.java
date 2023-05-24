/*Write a program to generate a triangle or an inverted triangle till n terms based upon the User’s choice of the triangle to be displayed.
Example 1:
Input: Type 1 for a triangle and 
Type 2 for an inverted triangle
Enter your choice 1
Enter the number of terms 5
Sample Output:
* * * * *
  * * * *
    * * *
      * *
        *
Example 2:
Input: Type 1 for a triangle and
Type 2 for an inverted triangle
Enter your choice 2
Enter the number of terms 5
Sample Output:
A B C D E  
A B C D  
A B C  
A B  
A*/
import java.util.*;
class Ch4_q22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type 1 for a triangle: ");
		System.out.println("Type 2 for a inverted triangle: ");
		System.out.println("Enter your choice: ");
		int ch=sc.nextInt();
		int i,j,k,n;
		switch(ch){
			case 1:
				System.out.print("Enter number of terms: ");
				n=sc.nextInt();
				for(i=n;i>=1;i--){
					for(k=1;k<=n-i;k++)
						System.out.print(" ");
					for(j=1;j<=i;j++){
						System.out.print("*");
					}
					System.out.println();
				}
					break;
			case 2:
				System.out.print("Enter number of terms: ");
				n=sc.nextInt();
				String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				for(i=n-1;i>=0;i--){
					for(j=0;j<=i;j++){
						System.out.print(s.charAt(j)+" ");
					}
				System.out.println();
				}
				break;
		}
	}
}