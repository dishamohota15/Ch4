/*Write a program to accept a sentence. Display the sentence in reversing order of its word.
Sample Input: Computer is Fun
Sample Output: Fun is Computer*/
import java.util.*;
class Ch4_q10{
     public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s,s1="";
        int i;
        char ch;
        System.out.println("Enter a string : ");
        s=in.nextLine();
        s=" "+s;
        for(i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            if(ch==' '){
                s1=s1+ch;
                System.out.print(s1);
                s1="";
            }
            else{
                s1=ch+s1;
            }
        }
    }
}