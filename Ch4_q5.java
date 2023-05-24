/*Write a program in Java to enter a String/Sentence and display the longest word and the length of the longest word present in the String.
Sample Input: "TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN"
Sample Output: The longest word: FOOTBALL: The length of the word: 8*/
import java.util.*;
class Ch4_q5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s,w="",lw="";  //lw is used to store the longest word & w is used to store current word
        char ch;
        int i,l;
        System.out.println("Enter a sentence : ");
        s=in.nextLine();
        s=s+" ";
        l=s.length();  
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch==' '){
                if(w.length()>lw.length()) // check whether current word length is greater
                    lw=w;
                w=""; // everytime reset the current word and set as blank
            }
             else{
                w=w+ch;
            }
        }
        System.out.println("The longest word is : "+lw);
        System.out.println("The length of the word : "+lw.length());
    }
}