package com.stg.pretest;

//Refer: https://www.youtube.com/watch?v=PAgvK1Oku6U
public class Maze4DY {
	public static void main(String[] args) {
		int rows=3; int cols=3;
		//create 2D Array, to store values of path we already cover //
		boolean [][] isVisited= new boolean[rows][cols];
		
		printPath(0,0,rows-1,cols-1,"",isVisited);
	}
	private static void printPath(int r, int c, int er, int ec, String path, boolean[][] isVisited) {
		// base conditions //
		if(r<0 || c<0) {			
			return;
		}
		if(r>er || c>ec) {
			return;
		}	
		if(isVisited[r][c] ==true) {
			return;
		}
		if(r==er && c==ec) {
			System.out.println(path);
			return;
		}
		isVisited[r][c]=true;
		
		// GO Down, means row+1
		printPath(r+1, c, er, ec, path+"D",isVisited);
		
		// GO Up, means row-1
		printPath(r-1, c, er, ec, path+"U",isVisited);
		
		// GO Right, means col+1
		printPath(r, c+1, er, ec, path+"R",isVisited);
		
		// GO Left, means col-1
		printPath(r, c-1, er, ec, path+"L",isVisited);
		
		// *backtracking* //
		isVisited[r][c]=false;		
	}

}
