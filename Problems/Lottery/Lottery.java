import java.io.*; 
import java.util.*;

public class Lottery {
	public static final int MAX_N = 10000;
	public static final int MAX_K = 100;
	public static void main(String[] args) {
		int[] count;
		int n = 1, c, k;
		int i, j, x, min;
		boolean first;
		Scanner in = new Scanner(System.in);
		 // n=in.nextInt();
		while ((n = in.nextInt()) > 0) {
			c = in.nextInt();
			k = in.nextInt();
			count = new int[MAX_K + 1]; 
			for (i = 0; i < n; i++) {
				for (j = 0; j < c; j++) { x = in.nextInt();
					count[x]++;
				}
			}
			min = n;

			for (i = 1; i <= k; i++)
				if (count[i] < min)
					min = count[i]; 
			first = true;
			
			for (i = 1; i <= k; i++) {
				if (count[i] == min) {
					if (!first) 
						System.out.print(" ");
					first = false;
					System.out.print(i); 
				}
			} 
			System.out.print("\n"); 
			// n=in.nextInt();
		} 
	}
}