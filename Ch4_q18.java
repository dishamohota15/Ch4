/*Special words are those words which start and end with the same letter.
Example: EXISTENCE, COMIC, WINDOW
Palindrome words are those words which read the same from left to right and vice-versa.
Example: MALYALAM, MADAM, LEVEL, ROTATOR, CIVIC
All palindromes are special words but all special words are not palindromes.
Write a program to accept a word. Check and display whether the word is a palindrome or only a special word or none of them.*/
import java.util.*;
class Ch4_q17{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String s=in.nextLine();
		String rev="";
		int l=s.length();
		int i;
		for(i=(s.length()-1);i>=0;i--){
			rev+=s.charAt(i);
		}
		if(rev.equals(s))
			System.out.println("It is palindrome as well as special word");
		else if(s.charAt(0)==s.charAt(l-1))
				System.out.println("It is special word");
		else
			System.out.println("It is neither palindrome nor special word");
	}
}

