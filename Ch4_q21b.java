/*A
B C
D E F
G H I J
K L M N O*/
class Ch4_q21b{
    public static void main(String args[]){
		int i,j,k=1;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print((char)(k+64)+" ");
				k++;
			}
			System.out.println();
		}
	}
}