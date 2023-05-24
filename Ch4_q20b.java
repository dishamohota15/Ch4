/*J
E E
U U U
L L L L
B B B B B*/
class Ch4_q20b{
    public static void main(String args[]){
		String s="BLUEJ";
		int i,j;
		for(i=4;i>=0;i--){
			for(j=4;j>=i;j--){
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println();
		}
	}
}