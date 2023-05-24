/*Using the switch statement, write a menu driven program for the following:
(a) To print the Floyd’s triangle:
1
2   3
4   5   6
7   8   9   10
11 12 13 14 15
(b) To display the following pattern:
I
I C
I C S
I C S E
For an incorrect option, an appropriate error message should be displayed.*/
import java.util.*;
class Ch4_q24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type 1 to print the Floyd triangle: ");
		System.out.println("Type 2 for a pattern: ");
		System.out.println("Enter your choice: ");
		int ch=sc.nextInt();
		int i,j;
		switch(ch){
			case 1:
				int k=1;
				for(i=1;i<=5;i++){
					for(j=1;j<=i;j++){
						System.out.print((k++)+" ");
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Enter a word: ");
				String s=sc.next();
				for(i=0;i<s.length();i++){
					for(j=0;j<=i;j++){
						System.out.print(s.charAt(j)+" ");
					}
				System.out.println();	
				}
				break;
			default:
				System.out.println("WRONG CHOICE");
		}
	}
}
