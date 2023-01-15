public class Pattern26{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=5;i>=1;i--){
			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
			for(int k=2;k<=i;k++){
				System.out.print("5");
			}
			System.out.println();
		}
	}
}