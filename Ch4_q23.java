/*Write a program to generate a triangle or an inverted triangle based upon User’s choice.
Example 1:
Input: Type 1 for a triangle and
Type 2 for an inverted triangle
Enter your choice 1
Enter a word : BLUEJ
Sample Output:
B
L L
U U U
E E E E
J J J J J
Example 2:
Input: Type 1 for a triangle and
Type 2 for an inverted triangle
Enter your choice 2
Enter a word : BLUEJ
Sample Output:
B L U E J
B L U E
B L U
B L
B*/
import java.util.*;
class Ch4_q23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type 1 for a triangle: ");
		System.out.println("Type 2 for a inverted triangle: ");
		System.out.println("Enter your choice: ");
		int ch=sc.nextInt();
		System.out.println("Enter a word: ");
		String s=sc.next();
		int i,j;
		switch(ch){
			case 1:
				for(i=0;i<s.length();i++){
					for(j=0;j<=i;j++){
						System.out.print(s.charAt(i)+" ");
					}
					System.out.println();
				}
				break;
			case 2:
				for(i=s.length()-1;i>=0;i--){
					for(j=0;j<=i;j++){
						System.out.print(s.charAt(j)+" ");
					}
				System.out.println();	
				}
				break;
		}
	}
}

