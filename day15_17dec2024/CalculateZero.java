public class CalculateZero {

	static int count =0;

	public static void main(String args[]) {
	  calcZeros(30204);
	  System.out.println("Count is: "+count);
	  calcZerosV2(300);
	}

	private static void calcZeros(int n) {		
		if (n%10==n) {
			return;
		}
		if(n%10==0) {
			count ++;
		}
		calcZeros(n/10);		
	}
	
	private static void calcZerosV2(int n) {
		int count =0;
		System.out.println(helper(n, count));
	}

	private static int helper(int num, int count) {
		if (num==0) {
			return count;
		}
		if(num%10==0) {
			return helper(num/10, count+1);
		}
		return helper(num/10, count);		
	}
}
