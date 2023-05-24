/*Write a program to input a sentence. Count and display the frequency of each letter of the sentence in alphabetical order.
Sample Input: COMPUTER APPLICATIONS
Sample Output:
*/
import java.util.*;
class Ch4_q16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s;
        int i,count;
        char ch;
        System.out.println("Enter a sentence : ");
        s=sc.nextLine().toUpperCase();
        System.out.println("Character\tFrequency");
        for(ch='A';ch<='Z';ch++){
            count=0;
            for(i=0;i<s.length();i++)
            {
                if(ch==s.charAt(i)) 
                    count++;
            }
            if(count>0)
                System.out.println(ch+"\t\t"+count);
        }
    }
}