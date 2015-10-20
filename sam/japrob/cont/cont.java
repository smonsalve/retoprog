import java.io.*; 
import java.util.*;

public class cont{
	public static void main(String[] args) {
		int n, c, v;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
 		while (n > 0) {
 			n--;
 			c = in.nextInt();
 			int[] count = new int[c+1];
 			for(int i = c ; i > 1 ; i--){
 				v = in.nextInt();
 				count[v]++;
 			}
 			for(int i= 1;i < c+1; i++){
 				if (count[i]==0){ 
 					System.out.println(i);
 				}
 			}
		} 
	} 
}