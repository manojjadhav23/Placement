// 
package com.demo.test;
class SumArgs{
	public static void main(String[] args){

 		int sum=0;
		System.out.println("length:"+args.length);

		if(args.length==0){
              		System.out.println("error");
			}
		else{
			for(int i=0;i<args.length;i++){
			int a =Integer.parseInt(args[i]);
			sum+=a;
			}
		}
System.out.println("Sum is:"+sum);
}
}