/*Write a program in Java to store 10 different country names and their capitals in two different Single Dimensional Arrays (SDA). 
Display the country names (that starts with a vowel) along with their capitals in the given format.
Country Names          Capital
    xxxx          		xxxx
    xxxx           		xxxx*/
import java.util.*;
class Ch4_q25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);	
		String cn[]=new String[10];
		String ca[]=new String[10];
		int i,cncount=0;
		char ch;
		System.out.println("Enter 10 different country names:");
		for(i=0;i<10;i++)
			cn[i]=sc.next();
		System.out.println("Enter the capital names of the above countries:");
		for(i=0;i<10;i++)
			ca[i]=sc.next();
		System.out.println("Country Names\tCapital");
		for(i=0;i<10;i++){
			ch=Character.toUpperCase(cn[i].charAt(0));
			if(ch== 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				System.out.println(cn[i]+"\t\t\t"+ca[i]);
			
		}
	}
}