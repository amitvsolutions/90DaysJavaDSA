public class MazePath2D {

	public static void main(String[] args) {
		int rows=2;
		int cols=2;
		int res=countPath(1,1,rows, cols);
		System.out.println(res);
	}

	private static int countPath(int sr, int sc, int er, int ec) {
		if(sr>er || sc>ec) {
			return 0;
		}
		if(sr==er && sc==ec) {
			return 1;
		}
		int downways=countPath(sr+1, sc,er,ec);
		int rightways=countPath(sr, sc+1, er, ec);
		int totalWays = downways + rightways;
		return totalWays;
	}

}
