/*A B C D E
A B C D A
A B C A B
A B A B C
A A B C D*/
class Ch4_q21c{
    public static void main(String args[]){
		String s="ABCDE";
		int i,j,k;
		for(i=4;i>=0;i--){
			for(j=0;j<=i;j++){
				System.out.print(s.charAt(j)+" ");
			}
			for(k=0;k<s.length()-1-i;k++){
				System.out.print(s.charAt(k)+" ");
			}
			System.out.println();
		}
	}
}