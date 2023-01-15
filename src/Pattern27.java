public class Pattern27{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=5;i++){
			int temp=i;
			for(int j=1;j<=i;j++){
				System.out.print(temp+" ");
				temp=temp+5-j;
			}
			System.out.println();
		}
	}
}