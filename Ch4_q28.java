/*Write a program in Java to input the names of 10 cities in a Single Dimensional Array. Display only those names which begin 
with a consonant but end with a vowel.
Sample Input: Kolkata, Delhi, Bengaluru, Jamshedpur, Bokaro, .......
Sample Output: Kolkata
Delhi
Bengaluru
Bokaro
....
....*/
import java.util.*;
class Ch4_q28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String c[]=new String[10];
        System.out.println("Enter 10 city names one by one : ");
        int i;
        char fchar,lchar;
        for(i=0;i<10;i++)
            c[i]=sc.nextLine();
        System.out.println("Cities starting with consonant & ending with vowel : ");
        for(i=0;i<10;i++){
            fchar=Character.toUpperCase(c[i].charAt(0));
            lchar=Character.toUpperCase(c[i].charAt(c[i].length() - 1));
                if((fchar!= 'A' || fchar!='E' || fchar!='I' || fchar!='O' || fchar!='U') && (lchar== 'A' || lchar=='E' || lchar=='I' || lchar=='O' || lchar=='U'))
                    System.out.println(c[i]);
        }
    }
}