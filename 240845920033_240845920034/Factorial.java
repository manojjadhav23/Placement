//factorial
import java.util.Scanner;
class Factorial{


		public static void main(String[] args){

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number:");
                         int num=sc.nextInt();
                          int fact=1;
			
			for(int i=num;i>0;i--)
				{
					fact=fact*i;
                                }
		System.out.println("Factorial:"+fact);
	}
}    
