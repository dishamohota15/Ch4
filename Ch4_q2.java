/*Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.
Sample Input: COMPUTER APPLICATIONS
Sample Output: CMPTR PPLCTNS*/
import java.util.*;
class Ch4_q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s=sc.nextLine();
		s=s.toUpperCase();
		String n="";
		int i;
		char ch;
		for(i=0;i<s.length();i++){
			ch=s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				continue;
			n+=ch;
		}
		System.out.println("New String: "+n);
	}
}