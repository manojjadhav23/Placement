package Java_2D;
import java.util.Scanner;
public class Array2DServices {

	public static void AcceptData(int[][] arr) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				 arr[i][j]=sc.nextInt();
			}
		}
	}

	public static void DisplayData(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				 System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void Addition(int[][] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum =sum+arr[i][j];
			}
	}
		System.out.println("Addition is:" +sum);
	}

	public static void AddRows(int[][] arr) {
		// TODO Auto-generated method stub
		int []sumrow=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sumrow[i] +=arr[i][j];
			}
	}
		for(int i=0;i<sumrow.length;i++) {
		System.out.println("Row Addition is:"+i+" "+sumrow[i]);
		}
	}

	public static void AddCol(int[][] arr) {
		// TODO Auto-generated method stub
		int []sumcol=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sumcol[j] +=arr[i][j];
			}
	}
		for(int i=0;i<sumcol.length;i++) {
		System.out.println("Col Addition is:"+i+" "+sumcol[i]);
		}
		
	}

}
