public class SumOfDigits {
	public static void main(String[] args) {
		int sum = sumOfDigits(1342);
		System.out.println(sum);
	}
	private static int sumOfDigits(int n) {
		if(n==0) {
			return 0;
		}		
		return n%10 + sumOfDigits(n/10);		
	}
}
