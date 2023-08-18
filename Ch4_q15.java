/*A 'Happy Word' is defined as: Take a word and calculate the word's value based on position of the letters in English alphabet. 
On the basis of word’s value, find the sum of the squares of its digits. Repeat the process with the resultant number until the
number equals 1 (one). If the number ends with 1 then the word is called a 'Happy Word'. Write a program to input a word and 
check whether it a ‘Happy Word’ or not. The program displays a message accordingly.
Write a program to input a word and check whether it a ‘Happy Word’ or not. The program displays a message accordingly.

Sample Input: VAT
Place value of V = 22, A= 1, T = 20
[Hint: A = 1, B = 2, ----------, Z = 26]

Solution:
22120 ⇒ 22 + 22 + 12 + 22 + 02 = 13
           ⇒ 12 + 32 = 10
           ⇒ 12 + 02 = 1

Sample Output: A Happy Word*/
import java.util.*;
class Ch4_q15{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string or word : ");
        String s=in.nextLine();
		String nn="";
        s=s.toUpperCase();
        int n=s.length(),i,rem;
        double c=0,temp;
        for(i=0;i<n;i++){
            nn=nn+ Integer.toString((int)(s.charAt(i))-64);   //86-64=22
        }
        int no=Integer.parseInt(nn);
        temp=no;
        while(true){   
            while(temp>=10){
                c=0;
                while(temp!=0){
                    rem=(int)temp%10;
                    c=Math.pow(rem,2)+c;
                    temp=temp/10;
                }
                temp=c;
            }
            if(temp==1)
                System.out.println(s+" is a happy word");
            else
                System.out.println(s+" is not a happy word");
            break;
        }
        
    }
}