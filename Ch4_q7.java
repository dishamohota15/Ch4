/*Write a program in Java to accept a String in upper case and replace all the vowels present in the String with Asterisk (*) sign.
Sample Input: "TATA STEEL IS IN JAMSHEDPUR"
Sample output: T*T* ST**L *S *N J*MSH*DP*R */
import java.util.*;
class Ch4_q7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word in uppercase: ");
		String s=sc.nextLine();
		char ch;
		int i;
		for(i=0;i<s.length();i++){
			ch=s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				/*n+='*';
			else
				n+=ch;*/
			s=s.replace(ch,'*');
		}
		System.out.println("New String: "+s);
	}
}