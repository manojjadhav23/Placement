//Palindrome

import java.util.Scanner;
class Palindrome{

  		public static void main(String[] args){
                    
                     Scanner sc=new Scanner(System.in);
                     System.out.println("Enter number");
                             int n=sc.nextInt();                                             
			     int og=n;

                         int reverse=0;
                   
                        for(int i=n;i>0;){
                              int digit=i%10;
			      reverse=reverse*10+digit;
                               i=i/10;
                         }
                   
		if(og==reverse){
                     System.out.println("number is palindrome");
			}
			  else{
				System.out.println("Number is not palindrome");
			       }
  }
}
		  