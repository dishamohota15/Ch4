/*Consider the sentence as given below:
Blue bottle is in Blue bag lying on Blue carpet
Write a program to assign the given sentence to a string variable. Replace the word Blue with Red at all its occurrence. 
Display the new string as shown below:
Red bottle is in Red bag lying on Red carpet*/
class Ch4_q12{
    public static void main(String args[]){
		String s="Blue bottle is in Blue bag lying on Blue carpet";
		String n=s.replace("Blue","Red");
		System.out.println("Original string: "+s);
		System.out.println("Modified string: "+n);
	}
}