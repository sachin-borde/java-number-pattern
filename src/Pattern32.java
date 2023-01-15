public class Pattern32{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=5;i++){
			int a=0;
			int b=1;
			for(int j=1;j<=i;j++){
				int c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}