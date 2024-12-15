public class ReverseNumber { 
	static int sum;
	
    public static void main(String[] args) {
    	reverseApproach1(13429);
    	System.out.println(sum);
    	reverseApproach2(2354);
    }    
	private static void reverseApproach2(int n) {
		int digits = (int)(Math.log10(n))+1;
		System.out.println(digits);
		int result = revHelper(n, digits);
		System.out.println(result);
	}
	private static int revHelper(int n, int digits) {
		if(n%10==n) {
			return n;
		}
		int rem = n%10;
		return rem * (int)Math.pow(10, digits-1) + revHelper(n/10, digits-1);
	}
	private static void reverseApproach1(int n) {
		if(n==0) {
			return;
		}
		int rem = n%10;
		System.out.println("rem for "+n +" is "+ rem);
		sum = sum*10 + rem;
		reverseApproach1(n/10);
	}
}
