/*Write a program in Java to enter a sentence. Frame a word by joining all the first characters of each word of the sentence. Display the word.
Sample Input: Vital Information Resource Under Seize
Sample Output: VIRUS*/
import java.util.*;
class Ch4_q8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String s=" "+sc.nextLine();  // add a space at the begining, at the time of user input
		String c="";
		s=s.toUpperCase();
	    for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') 
			//if the current character is space and the next character is not space
			//then store the character in a new string with a dot symbol 
            c=c+s.charAt(i+1);
		}
		System.out.print(c);
	}
}