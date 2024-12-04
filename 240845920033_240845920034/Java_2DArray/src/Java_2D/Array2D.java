package Java_2D;
import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int [3][3];
		int choice =0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1)Accept Numbers \n2)Display Numbers \n3)Addition \n4)Row Addition \n5)col Addition \n6)Exit \nChoice:");
		
		System.out.println("Enter Choice:");
		choice = sc.nextInt();
		switch(choice){
		case 1:Array2DServices.AcceptData(arr);
			break;
		case 2:Array2DServices.DisplayData(arr);
			break;
		case 3:Array2DServices.Addition(arr);
			break;
		case 4:Array2DServices.AddRows(arr);
			break;
		case 5:Array2DServices.AddCol(arr);
			break;
		case 6:
			System.out.println("Done");
			break;
		default:
			System.out.println("Wrong Input");
			}
		}while(choice !=5 );

	}

}

	