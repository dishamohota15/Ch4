/*Write a program to accept a word and convert it into lower case, if it is in upper case. Display the new word by replacing only the vowels
with the letter following it.
Sample Input: computer
Sample Output: cpmpvtfr*/
import java.util.*;
class Ch4_q13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string ");
		String s=sc.nextLine();
		System.out.println("Original string: "+s);
		s=s.toLowerCase();
		char v,ch;
		int i;
		for(i=0;i<s.length();i++){
			v=s.charAt(i);
			if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'){
				s=s.replace(v,(char)(v+1));
			}
		}
		System.out.println("Modified string: "+s);
	}
}

