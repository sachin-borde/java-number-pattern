public class Pattern7{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}