/*Write a program to input a sentence and display the word of the sentence that contains maximum number of vowels.
Sample Input: HAPPY NEW YEAR
Sample Output: The word with maximum number of vowels: YEAR*/
import java.util.*;
class Ch4_q11{
    public static void main(String args[]){
        int i,cwvcount=0,mvcount=0;
        char ch;
        String cw="",mvword="";   // intialize current word & maximum vowel word as blank
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String s = sc.nextLine();
        s=s.toUpperCase();  // convert the whole sentence to uppercase
        s=s+" ";  // Add a space to the end of the whole sentence
        for(i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch==' '){   // check whether a word is complete 
                if(cwvcount>mvcount){   // check current word vowel count is greater than maximum vowel count
                    mvword=cw;        // set current word as maximum vowel word
                    mvcount=cwvcount;  // set max vowel count as current word vowel count
                }
                cw="";  // set current word as blank after each word checking
                cwvcount=0; // set current word vowel count as 0 after each word checking
            }
            else{
                if(ch=='A'|| ch=='E' || ch=='I'|| ch=='O'|| ch=='U')  // check whether each character is vowel 
                    cwvcount++;   // if yes then increment the current word vowel count
                cw=cw+ch;   // store each character in current word
            }
        }
        System.out.println("The word with maximum no. of vowel is : "+mvword+" with "+mvcount+" vowel(s)");
    }
}



