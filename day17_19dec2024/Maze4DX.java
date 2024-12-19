package com.stg.pretest;

public class Maze4DX {
	public static void main(String[] args) {
		int rows=3; int cols=4;
		
		printPath(0,0,rows,cols,"");
	}
	private static void printPath(int r, int c, int er, int ec, String path) {
		// base conditions //
		if(r<1 || c<1) {			
			return;
		}
		if(r>er || c>ec) {
			return;
		}		
		if(r==er && c==ec) {
			System.out.println(path);
			return;
		}
		// GO Down, means row+1
		printPath(r+1, c, er, ec, path+"D");
		
		// GO Up, means row-1
		printPath(r-1, c, er, ec, path+"U");
		
		// GO Right, means col+1
		printPath(r, c+1, er, ec, path+"R");
		
		// GO Left, means col-1
		printPath(r, c-1, er, ec, path+"L");
		
	}

}
