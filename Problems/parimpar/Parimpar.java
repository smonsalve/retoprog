import java.io.*;
import java.util.*;

public class Parimpar{

	public static void main(String[] args){
		int Juan = 0, Maria = 0, x, n, i;
		Scanner in = new Scanner(System.in);
		while ((n = in.nextInt()) > 0){
			Juan = 0;
			Maria = 0;
			for (i = 0; i < n; i++){
				x = in.nextInt(); 
				if ((x & 1) == 1) 
					Maria++; 
			}
			for (i = 0; i < n; i++){ 
				x = in.nextInt();
				if ((x & 1) == 0)
					Juan++; 
			}
		}
		if ( Juan > Maria )	
			System.out.println(Juan - Maria);
		else 
			System.out.println(Maria - Juan);
	}
}	