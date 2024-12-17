public class ReduceNumber {
	// for a given num, return num of steps to reduce it to zero//
	public static void main(String[] args) {
		// if number is even, divide it by 2 otherwise subtract 1 from it//
		System.out.println("Steps= "+calcSteps(8, 0));
	}
	private static int calcSteps(int num, int count) {
		if(num==0) {
			return count;
		}
		if(num%2==0) {
			System.out.println(num);
			return calcSteps(num/2, count+1);
		}else {
			System.out.println(num);
			return calcSteps(num-1, count+1);
		}		
	}
}
