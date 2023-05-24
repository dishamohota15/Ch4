/*Write a program to input a sentence. Convert the sentence into upper case letters. Display the words along with frequency of the words which have at least a pair of consecutive letters.
Sample Input: MODEM IS AN ELECTRONIC DEVICE
Sample Output: 
MODEM
DEVICE
Number of words containing consecutive letters: 2*/
import java.util.*;
class Ch4_q19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,ccount=0,cwcount=0;
        char ch;
        String cw="";
        System.out.println("Enter a sentence : ");
        s=sc.nextLine().toUpperCase();
        s=s+" ";
        for(i=0;i<s.length();i++)
        {
                if(s.charAt(i)==' '){
                    if(ccount>0){
                        System.out.println(cw);
                        cwcount++;
                    }
                    cw="";
                    ccount=0;
                }
                else{
                    if(s.charAt(i)+1==s.charAt(i+1))
                        ccount++;
                    cw=cw+s.charAt(i);
                }
        }
        System.out.println("Number of words containing consecutive letters : "+cwcount);
    }
}