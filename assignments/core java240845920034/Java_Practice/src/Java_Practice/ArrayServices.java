package Java_Practice;

import java.util.Scanner;
public class ArrayServices {

	public static void acceptdata(int[] arr) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}

	public static void displaydata(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			System.out.println(i+":"+a[i]);
		}
		
	}

	public static int searchdata(int[]arr,int search) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==search) {
			System.out.println("Number is at Postion : "+i);
			return i;
		}
		}
		return -1;
		
	}
	
	public static void AddAllEvenNos(int[] arr) {
		// TODO Auto-generated method stub
		int sum= 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				sum += arr[i];
			}
		}
		System.out.println("Sum Of All Even Number is: "+sum);
		
	}

	public static int[] FindAllPrimeNos(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int[] primearr=new int[arr.length];
			int cnt=0;
			for(int n:arr) {
				boolean ans =isPrime(n);
				if(ans) {
					primearr[cnt]=n;
					cnt++;
				}	
			}
			if(cnt>0) {
				return primearr;
			}
		}
		return null;
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}



