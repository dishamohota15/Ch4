/*Write a program in Java to store 10 words in a Single Dimensional Array. Display only those words which are Palindrome.
Sample Input: MADAM, TEACHER, SCHOOL, ABBA, .........
Sample Output: MADAM
ABBA*/
import java.util.*;
class Ch4_q29{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name[] = new String[10];
		String rev[]=new String[10];
		int i,j,count=0;
		System.out.println("Enter 10  words: ");
        for(i=0;i<10;i++){
            name[i]=in.nextLine();
		}
		for(i=0;i<10;i++){
			rev[i]="";
			for(j=(name[i].length()-1);j>=0;j--){
				rev[i]+=name[i].charAt(i);
			}
			if(rev[i].equalsIgnoreCase(name[i])){
				rev[count]=name[i];
				count++;
			}
		}
		System.out.println("Palindrome word in the array: ");
		for(i=0;i<count;i++){
			System.out.println(rev[i]);
		}
	}
}
		