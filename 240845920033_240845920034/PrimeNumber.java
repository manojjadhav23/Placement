//Prime Number

class PrimeNumber{
	public static void main(String[] args){
		System.out.println("Length"+args.length);
		int sum=0;
		
		
		if(args.length==0){
			System.out.println("Error");
			}
		else{
			for(int j=0;j<args.length;j++){
			int n=Integer.parseInt(args[j]);
			
			
			while(args.length>0){
				for(int i=2;i<n;i++){
					if(n%i!=0){
						sum=sum+n;
					}
				}}
			}
		}
	}
}
