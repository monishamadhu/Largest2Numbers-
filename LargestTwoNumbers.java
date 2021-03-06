package week4.largestTwoNumbers;

import acm.program.*;
import java.util.*;

public class LargestTwoNumbers extends ConsoleProgram {
	private static final int SENTINEL=0;
	ArrayList<Integer> large = new ArrayList<Integer>();
	public void run() {
		
		while(true) {
			int n=readInt("? ");
			if(n == SENTINEL) break;
			large.add(n);
		}
		
		
		Collections.sort(large,Collections.reverseOrder());
		System.out.println("The largest value is: "+ large.get(0));
		System.out.println("The second largest value is: " + large.get(1));
	}
}
/*public class LargestTwoNumbers extends ConsoleProgram {
	private static final int SENTINEL=0;
	
	public void run() {
		int large=0;
		while(true) {
			int n=readInt("? ");
			if(n == SENTINEL) break;
			if(n>large) {
				large=n;
			}
		}
		System.out.println(large);
	}	
}*/

