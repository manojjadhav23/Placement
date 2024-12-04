//Write a program to accept 10 numbers from user and find sum of all numbers which are eith divisible 
//by 5 or 3 or 11
import java.util.Scanner;
class AcceptNumber{


		public static void main(String[] args){

                   Scanner sc=new Scanner(System.in);
			int sum=0;
			for(int i=0;i<5;i++)
                       {
                   System.out.println("enter number:");
			
				int user=sc.nextInt();
                         if(user%5==0 || user%3==0 || user%11==0)
				{
 				
				sum=sum+user;
                               }
			}
                 System.out.println("Sum is:"+sum);
}
}
