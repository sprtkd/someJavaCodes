import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		int[] arrayInt = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<arrayInt.length; i++)
		{
			arrayInt[i] = input.nextInt();
		}
		
		for(int i=0;i<arrayInt.length; i++)
		{
			System.out.println(arrayInt[i]);
		}
		
		String[] arrayString = {"hello","bolo","cholo"};
		
		for(String iter: arrayString)
		{
			System.out.println(iter);
		}
		
		int[][] matrixInt = {{1,2,3,4},{5,6},{7,8,9}};
		
		for(int row=0;row<matrixInt.length; row++)
		{
			for(int col=0; col<matrixInt[row].length; col++)
			{
				System.out.print(matrixInt[row][col] + " ");
			}
			System.out.println();
		}
		
		
		input.close();
	}

}
