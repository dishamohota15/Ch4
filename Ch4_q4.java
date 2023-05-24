/*Write a program in Java to accept a name containing three words and display the surname first, followed by the first and middle names.
Sample Input: MOHANDAS KARAMCHAND GANDHI
Sample Output: GANDHI MOHANDAS KARAMCHAND*/
import java.util.*;
class Ch4_q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String s=sc.nextLine();  // add a space at the begining, at the time of user input
		//String c="";
		s=s.toUpperCase();
		String fpart="",spart="";
		int lsindex=s.lastIndexOf(' ');
		fpart=s.substring(lsindex+1); // cut the last part (surname)
		spart=s.substring(0,lsindex); // cut the first part (first name & middle name if available)
	    /*for(int i=s.length();i>=0;i--){
			c+=s.charAt(i);
		}*/
		System.out.println("New String : "+fpart+" "+spart);
	}
}