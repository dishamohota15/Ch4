/*Write a program to accept the names of 10 cities in a single dimensional string array and their STD (Subscribers Trunk Dialling) 
codes in another single dimension integer array. Search for the name of a city input by the user in the list. If found, display 
"Search Successful" and print the name of the city along with its STD code, or else display the message "Search unsuccessful, 
no such city in the list".*/
import java.util.*;
class Ch4_q30{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name[] = new String[10];
        long std[] = new long[10];
		int c=0;
        System.out.println("Enter 10 cities name and their STD (Subscribers Trunk Dialling)");
        for(int i=0;i<10;i++){
            System.out.print("Enter Name of "+(i+1)+"th city ");
            name[i] = in.next();
            System.out.print("Enter STD of "+(i+1)+"th city ");
            std[i] = in.nextLong();
        }
		System.out.print("Enter a city name: ");
		String city=in.next();
		for(int i=0;i<10;i++){
			if(name[i].equalsIgnoreCase(city)){
				System.out.println("Search successful ");
				System.out.println("city name: "+name[i]);
				System.out.println("std code: "+std[i]);
				c=1;
				break;
			}
		}
		if(c==0)
			System.out.println("Search unsuccessful, no such city in the list");
	}
}
		