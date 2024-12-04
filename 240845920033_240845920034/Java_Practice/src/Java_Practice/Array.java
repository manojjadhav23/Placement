package Java_Practice;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int[]arr=new int[5];
		ArrayServices.acceptdata(arr);
		ArrayServices.displaydata(arr);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number to Search");
		int search=sc.nextInt();
		int pos=ArrayServices.searchdata(arr,search);
		if(pos==-1) {
			System.out.println("Number not Found");
		}
		else {
			System.out.println("Number Found");
		}
		
		ArrayServices.AddAllEvenNos(arr);
		
		int primearr[]=ArrayServices.FindAllPrimeNos(arr);
		if(primearr !=null) {
			for(int i=0;i<primearr.length;i++) {
				System.out.println(primearr[i]);
			}
		}
		else {
			System.out.println("No Prime Number Found");
		}
		sc.close();
		
	}
	
}
