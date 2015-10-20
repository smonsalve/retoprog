import java.util.*;

public class Maps {

	public static char[] vecinos = new char[5000];

	public static void main(String[] args) { 
		int n, i, l, l1;
		String m;
		Scanner in = new Scanner(System.in); 
		m = in.nextLine();
		n = Integer.parseInt(m); 
		for (i = 0; i < n; i++) {
			m = in.nextLine();
			vecinos = m.toCharArray(); 
			l1 = m.length() - 1;
			l = l1;
			Arriba(l);
			if (vecinos[0] == 1) 
				System.out.print("<none> ");
			else { 
				System.out.print(vecinos);
				System.out.print(" "); 
			}
			l = l1;
			vecinos = m.toCharArray(); 
			Abajo(l);
			if (vecinos[0] == 1)
				System.out.print("<none> "); 
			else {
				System.out.print(vecinos);
				System.out.print(" "); 
			}
			vecinos = m.toCharArray();
			l = l1;
			Izquierda(l);
			if (vecinos[0] == 1)
				System.out.print("<none> ");
			else {
				System.out.print(vecinos);
				System.out.print(" "); 
			}
			vecinos = m.toCharArray();
			l = l1;
			l = l1;
			Derecha(l);
			if (vecinos[0] == 1) 
				System.out.println("<none>");
			else {
				System.out.println(vecinos); 
			}
		} 
	}

	public static void Arriba(int i) { 
		if (i == 0) {
			vecinos[0] = 1;
			return; 
		}

		switch (vecinos[i]) { 
		case 'p':
			Arriba(i - 1); 
			vecinos[i] = 's'; 
			break;
		case 'q':
			Arriba(i - 1); 
			vecinos[i] = 'r'; 
			break;
		case 'r':
			vecinos[i] = 'q'; 
			break;
		case 's':
			vecinos[i] = 'p'; 
			break;
		} 
	}
	public static void Abajo(int i) { 
		if (i == 0) {
			vecinos[0] = 1;
			return; 
		}
		switch (vecinos[i]) { 
		case 'p':
			vecinos[i] = 's';
			break; 
		case 'q':
			vecinos[i] = 'r';
			break; 
		case 'r':
			Abajo(i - 1); vecinos[i] = 'q'; 
			break;
		case 's':
			Abajo(i - 1); vecinos[i] = 'p'; 
			break;
		} 
	}
	public static void Derecha(int i) {
		if (i == 0) {
			vecinos[0] = 1; 
			return;
		}
		switch (vecinos[i]) { 
		case 'p':
			vecinos[i] = 'q';
			break; 
		case 'q':
			Derecha(i - 1); vecinos[i] = 'p'; 
			break;
		case 'r':		
			Derecha(i - 1); vecinos[i] = 's'; 
			break;
		case 's':
			vecinos[i] = 'r'; 
			break;
		} 
	}
	public static void Izquierda(int i) { // System.out.print("i="+i); //System.out.println(vecinos);
		if (i == 0) {
			vecinos[0] = 1;
			return;
		}
		switch (vecinos[i]) { 
		case 'p':
			Izquierda(i - 1); 
			vecinos[i] = 'q'; 
			break;
		case 'q':
			vecinos[i] = 'p'; 
			break;
		case 'r':
			vecinos[i] = 's'; 
			break;
		case 's': 
			Izquierda(i - 1); 
			vecinos[i] = 'r'; 
			break;
		}
	}
}