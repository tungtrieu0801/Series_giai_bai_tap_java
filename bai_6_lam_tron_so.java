package luyen_code;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		int output;
		if(n>=0) {
			output = (int) (n + 0.5);
		}else {
			output = (int) (n-0.5);
		}
		System.out.println(output);
		sc.close();
	}
}
