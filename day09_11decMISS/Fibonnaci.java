public class Fibonnaci {
    public static int fibonacci(int n) {
    	System.out.println(n);
        if (n < 2) {
            return n;
        }
       
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonaci number is "+fibonacci(2)); // Output: 4
    }
}
