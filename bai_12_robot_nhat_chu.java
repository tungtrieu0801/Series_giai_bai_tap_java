import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		HashSet<Character> b = new HashSet<Character>();
		StringBuilder result = new StringBuilder();
		
		for(int i = 0;i<a.length();i++) {
			char current = a.charAt(i);
			if(!b.contains(current)) {
				b.add(current);
				result.append(current);
			}
		}
		System.out.println(result.toString());
	}
}