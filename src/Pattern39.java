public class Pattern39{
	public static void main(String[] args){
		
		/*Way 1*/
		int currentRow = 1;
        int counter = 1;
		for (int i=1; i<= 5; i++)
        {
            if (i % 2 == 0) 
            {
                int reverse = currentRow + counter - 1;
                for (int j = 0; j<i; j++)
                {
                    System.out.print(reverse--  +" ");
                    counter++;
                }
            }
            else
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print(counter  +" ");
                    counter++;
                }
            }
            System.out.println();
            currentRow++;
        }
	}
}