package Assignment01 ;

import java.util.Scanner;

public class Java2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		int [][]arr1=new int [n][n];
		int [][]arr2=new int [n][n];
		int choice =0;
		do {
		System.out.println("1)Accept Numbers \n2)Display Numbers \n3)Addition \n4)Multiplication \n5)Check Symmetric \nChoice:");
		choice=sc.nextInt();
			switch(choice) {
			case 1:Java2D_ArrayServices.AcceptNos(arr1,arr2);
				break;
			case 2:Java2D_ArrayServices.DisplayNos(arr1,arr2);
				break;
			case 3:Java2D_ArrayServices.AddArray(arr1,arr2);
				break;
			case 4:Java2D_ArrayServices.MultiplyArray(arr1,arr2);
				break;
			case 5:Java2D_ArrayServices.CheckSymmetric(arr1,arr2);
				break;
			}
		}while(choice !=6);

	}

}