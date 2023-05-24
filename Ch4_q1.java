/*Write a program to input a sentence. Find and display the following:
(i) Number of words present in the sentence
(ii) Number of letters present in the sentence
Assume that the sentence has neither include any digit nor a special character.*/
import java.util.*;
class Ch4_q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence ");
		String s=" "+sc.nextLine();
		int i,wcount=0,lcount=0;
		for(i=0;i<s.length();i++){
			if(s.charAt(i)==' ')
				wcount++;
			else
				lcount++;
		}
		System.out.println("Number of words present in the sentence: "+wcount);
		System.out.println("Number of letters present in the sentence: "+lcount);
	}
}