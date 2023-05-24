/*Write a program to accept a string. Convert the string into upper case letters. Count and output the number of double letter sequences 
that exist in the string.
Sample Input: "SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE"
Sample Output: 4*/
import java.util.*;
class Ch4_q17{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string or word : ");
        String s=in.nextLine();
		s=s.toUpperCase();
		char ch;
		int count=0,i;
		for(i=0;i<s.length()-1;i++){
			ch=s.charAt(i);
			if(ch==s.charAt(i+1))
				count++;
		}
		System.out.println("No. of double letter sequences in string: "+count);
	}
}