public class Pattern18{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}