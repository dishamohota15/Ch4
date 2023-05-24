/*Write a program in Java to accept a name(Containing three words) and display only the initials (i.e., first letter of each word).
Sample Input: LAL KRISHNA ADVANI
Sample Output: L K A*/
import java.util.*;
class Ch4_q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
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