public class Pattern33{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=5;i>=1;i--){
			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
			for(int k=4;k>=i;k--){
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++){
			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
			for(int k=4;k>=i;k--){
				System.out.print(k);
			}
			System.out.println();
		}
	}
}