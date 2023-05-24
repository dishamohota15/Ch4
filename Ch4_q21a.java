/*A B C D E
B C D E
C D E
D E
E*/
class Ch4_q21a{
    public static void main(String args[]){
		String s="ABCDE";
		int i,j;
		for(i=0;i<=4;i++){
			for(j=i;j<=4;j++){
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}