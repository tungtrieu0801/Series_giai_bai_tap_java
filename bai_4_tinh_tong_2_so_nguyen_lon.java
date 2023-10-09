package day_9;
import java.util.HashSet;
import java.util.Scanner;
import java.math.BigInteger;
public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Lưu ý rằng cách này có thể giới hạn độ lớn của số mà bạn có thể nhập.
        //Nếu bạn không biết trước độ lớn của số hoặc nó có thể vượt quá giới hạn của int hoặc long,
        //thì việc sử dụng String là lựa chọn tốt nhất để đảm bảo tính linh hoạt và độ chính xác của tính toán.
        String a = sc.nextLine();
        String b = sc.nextLine();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger sum = A.add(B);
        System.out.println(""+sum);
        sc.close();
    }
}



