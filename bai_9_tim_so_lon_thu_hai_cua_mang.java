import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int max=Integer.MIN_VALUE;
		int second_max= Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			if(arr[i] > max) {
				second_max = max;
				max = arr[i];
			}else if(arr[i]>second_max && arr[i]<max) {
				second_max =arr[i];
			}
		}
		if(second_max!=Integer.MIN_VALUE) {
			System.out.println(second_max);
		}else {
			System.out.println("NOT FOUND");
		}
	}
}