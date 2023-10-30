import java.io.*;
import java.util.*;
public class main {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b=  sc.nextInt();
	  if(tong(a)==b || tong(b)==a) {
		  System.out.println("YES");
	  }else {
		  System.out.println("NO");
	  }
   }
   public static int tong(int n) {
	   ArrayList<Integer> list  = new ArrayList<Integer>();
	   for(int i = 1;i<n;i++) {
		   if(n%i ==0) {
			   list.add(i);
		   }
	   }
	   int tong=0;
	   for(int i=0;i<list.size();i++) {
		   tong+=list.get(i);
	   }
	   return tong;
   }
}