public class Pattern13{
	public static void main(String[] args){
		
		/*Way 1*/
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			int temp=1;
			for(int k=1;k<=i;k++){
				System.out.print(temp+" ");
				temp=temp*(i-k)/k;
			}
			System.out.println();
		}
	}
}