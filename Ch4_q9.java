/*Write a program in Java to enter a sentence. Display the words which are only palindrome.
Sample Input: MOM AND DAD ARE NOT AT HOME
Sample Output: 
MOM 
DAD*/
import java.util.*;
class Ch3_q9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		int i;
		String s=sc.nextLine();
		s=s+" "; // add a space to denote the word is complete
		String w="";  // each time store current word
		String rev=""; // store reverse word
		for(i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				if(rev.equalsIgnoreCase(w))
					System.out.println(w);
				w=""; // everytime reset the current word 
				rev=""; // everytime reset the reverse word 
			}
			else{
				w=w+s.charAt(i);
				rev=s.charAt(i)+rev;
			}
		}
	}
}