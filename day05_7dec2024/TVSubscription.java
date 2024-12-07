package com.codechef;

import java.util.Scanner;

public class TVSubscription
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);			
		int T = s.nextInt();
		while(T-- > 0){
		    int N = s.nextInt();
		    int X = s.nextInt();
		    int R = N%6;
		    int Q = N/6;
		    if(R>0 && Q==0){
		        System.out.println(X);
		    }if(R>0 && Q>0){
		       System.out.println((Q+1)*X); 
		    }
		    if(R==0 && Q>0){
		        System.out.println(Q*X);
		    }		        
		}
		//calcSubs(s); // Good Approach //
	}

	private static void calcSubs(Scanner sc) {
		int t = sc.nextInt();
		while(t-->0){
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int subs = (N+5)/6;
		    
		    System.out.println(X*subs);
		}
		
	}
}

