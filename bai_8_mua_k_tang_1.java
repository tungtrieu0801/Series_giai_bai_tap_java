package luyen_code;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		long n =sc.nextLong();
		long k = sc.nextLong();
		long p =sc.nextLong();
		long so_but_tang_them  = n /(k+1);
		long tong_can_mua = n - so_but_tang_them;
		System.out.println(tong_can_mua*p);
	}
}