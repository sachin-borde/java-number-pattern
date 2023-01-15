public class Pattern28{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=4;i++){
			int temp=i;
			for(int j=1;j<=i;j++){
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		int temp=5;
		for(int i=3;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(temp*j+" ");
			}
			temp++;
			System.out.println();
		}
	}
}