package luyen_code;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double chu_vi = 2*r * 3.14;
		double dt = 3.14*r*r;
		String format_chu_vi = String.format("%.3f", chu_vi);
		String format_dt = String.format("%.3f", dt);
		System.out.println(format_chu_vi + " " + format_dt);
	}
}
