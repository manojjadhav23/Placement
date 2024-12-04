
public class TestString {
     public static void main(String[] args) {
		String s1="english";
		String s2=s1;
		String s3="english";
		String s4=new String("English");
		
		System.out.println("s1==s2 => "+(s1==s2));
		System.out.println("s1==s3 => "+(s1==s3));
		System.out.println("s1==s4 => "+(s1==s4));
		
		s1=s1.concat(" Language");
		System.out.println(s1);
		
		s1=s1.replace('e', 'E');
		System.out.println(s1);
	}
	 
	 
}
