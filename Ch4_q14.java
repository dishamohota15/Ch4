/*Write a program to input a sentence. Create a new sentence by replacing each consonant with the previous letter. If the previous
 letter is a vowel then replace it with the next letter (i.e., if the letter is B then replace it with C as the previous letter of B is A). 
 Other characters must remain the same. Display the new sentence.
Sample Input     : ICC WORLD CUP
Sample Output  : IBB VOQKC BUQ*/
import java.util.*;
class Ch4_q14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s=sc.nextLine();
		s=s.toUpperCase();
		String n="";
		char v,ch;
		int i;
		System.out.println("Original string : "+s);
		for(i=0;i<s.length();i++){
                v=s.charAt(i);   // v denotes the current character
                ch=(char)(v-1);  // ch denotes the current character's previous albhabet
                if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U' || v==' ')
                    n=n+v;
                else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    n=n+(char)(v+1);
                else 
                   n=n+(char)(v-1);
            }
            System.out.println("Modified string : "+n);
	}
}