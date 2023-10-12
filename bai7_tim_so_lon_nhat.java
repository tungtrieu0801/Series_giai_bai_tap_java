package luyen_code;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		list.add(a);
		list.add(b);
		list.add(c);
		list.sort(null);
		System.out.println(list.get(2));
	}
}

