public class Pattern22{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=5;i++){
			for(int j=2;j<=i;j++){
				System.out.print("0");
			}
			for(int k=i;k<=i;k++){
				System.out.print(k);
			}
			for(int l=4;l>=i;l--){
				System.out.print("0");
			}
			System.out.println();
		}
	}
}