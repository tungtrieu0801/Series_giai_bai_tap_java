package luyen_code;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
    	ArrayList<Integer> list =  new ArrayList<Integer>();
    	ArrayList<Integer> list_so_le =  new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			int z = sc.nextInt();
			list.add(z);
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i)%2!=0) {
				list_so_le.add(list.get(i));
			}
		}
		float sum = 0;
		for(int i= 0 ;i<list_so_le.size();i++) {
			sum+= list_so_le.get(i);
		}
		float number = (float)sum/(list_so_le.size());
		String result = String.format("%.4f", number);
		System.out.println(result);
	}
}

