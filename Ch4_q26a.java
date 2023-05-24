/*Write a program in Java to store 20 different names and telephone numbers of your friends in two different Single Dimensional Arrays (SDA). 
Now arrange all the names in alphabetical order and display all the names along with their respective telephone numbers using selection sort technique.
*/
import java.util.*;
class Ch4_q26a{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n[]=new String[20],tname;
        long no[]=new long[20],tno;
        int i,j,min;
        System.out.println("Enter name and telephone numbers one by one : ");
        for(i=0;i<20;i++){
            System.out.print("Enter Name : ");
            n[i]=sc.nextLine();
            System.out.print("Enter telephone number: ");
            no[i]=sc.nextLong();
            sc.nextLine();   // need to consume the newline character, to avoid the java error
        }
        //Selection Sort logic - Set minimum index as i as compare with rest of the element, forward by one and repeat
        for(i=0;i<19;i++){
            min=i;
            for(j=i+1;j<20;j++){
                if(n[min].compareToIgnoreCase(n[j])>0)
                    min=j;
            }
            //Swap names
            tname=n[min];
            n[min]=n[i];
            n[i]=tname;
            //Swap telephone numbers
            tno=no[min];
            no[min]=no[i];
            no[i]=tno;
        }
        System.out.println("Name\t\tTelephone Number");
        for(i=0;i<20;i++){
            System.out.println(n[i]+"\t\t"+no[i]);
        }
    }
}