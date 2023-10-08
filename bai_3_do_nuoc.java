package luyen_code;

import java.util.Scanner;

public class main {
	 //tim uoc chung nhat a b bang viec su dung ham GCD
	public static int qcd(int  a, int b) {
		if(b==0) {
			return a;
		}
		return qcd(b, a%b);
	}
	//ham kiem tra co the lay dung c lit nuoc hay khong
	public static boolean result(int a, int b, int c) {
		if(c>a+b) {
			return false;
		}
		if(c % qcd(a,b)==0){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++) {
			int a = sc.nextInt();
			int b =sc.nextInt();
			int c = sc.nextInt();
			if(result(a, b, c)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}

