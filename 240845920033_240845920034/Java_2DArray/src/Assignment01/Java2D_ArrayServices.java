package Assignment01;
import java.util.Scanner;
public class Java2D_ArrayServices {
		public static void AcceptNos(int[][] arr1, int[][] arr2) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Array:");
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					arr1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter Second Array:");
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					arr2[i][j]=sc.nextInt();
				}
			}	
		}

		public static void DisplayNos(int[][] arr1, int[][] arr2) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("FIrst Array:");
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("Second Array:");
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr2.length;j++) {
				System.out.print(arr2[i][j]+"\t");
				}
				System.out.println();
			}	
		}

		public static void AddArray(int[][] arr1, int[][] arr2) {
			// TODO Auto-generated method stub
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+"\t\t");
				}
				System.out.println();
			}
			System.out.println("\t+");
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr2.length;j++) {
				System.out.print(arr2[i][j]+"\t\t");
				}
				System.out.println();
			}
			
			System.out.println("\t= ");
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					System.out.print(arr1[i][j]+arr2[i][j]+"\t\t");
				}
				System.out.println();
			}
		}

		public static void MultiplyArray(int[][] arr1, int[][] arr2) {
			// TODO Auto-generated method stub
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+"\t\t");
				}
				System.out.println();
			}
			System.out.println("\t*");
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr2.length;j++) {
				System.out.print(arr2[i][j]+"\t\t");
				}
				System.out.println();
			}
			
			System.out.println("\t= ");
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					System.out.print(arr1[i][j]*arr2[i][j]+"\t\t");
				}
				System.out.println();
			}
		}

		public static int CheckSymmetric(int[][] arr1, int[][] arr2) {
			// TODO Auto-generated method stub
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					if(arr1[i][j]==arr2[i][j]) {
						System.out.println("Two Array are Symmetric");
						return 1;
					}
				}
			}
			System.out.println("Not Symmetric");
			return 0;
		}

	}


