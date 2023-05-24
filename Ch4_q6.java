/*Write a program in Java to accept a word and display the ASCII code of each character of the word.
Sample Input: BLUEJ
Sample Output:
ASCII of B = 66
ASCII of L = 76
ASCII of U = 85
ASCII of E = 69
ASCII of J = 74*/
import java.util.*;
class Ch4_q6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s=sc.nextLine();
		int i;
		for(i=0;i<s.length();i++){
			System.out.println("ASCII of "+s.charAt(i)+" = "+(int)(s.charAt(i)));
		}
	}
}