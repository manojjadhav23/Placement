// fibonacci series

import java.util.Scanner;
class FibonacciSeries{
 		public static void main(String[] args){
                  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
                 int count=sc.nextInt();
		System.out.print("\n");
	
	      int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
              
		for(int i=2;i<count;++i)
                 {
                        c=a+b;
			System.out.println(c);

                         a=b;
			 b=c;
               }
}
}