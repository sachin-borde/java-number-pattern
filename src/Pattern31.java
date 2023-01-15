public class Pattern31{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=5;i>=1;i--){
			for(int j=5;j>=i;j--){
				System.out.print(j);
			}
			for(int k=i;k>=2;k--){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}