public class Pattern16{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}