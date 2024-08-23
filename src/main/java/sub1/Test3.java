package sub1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        // 세자리 수 아니면 종료
        if (a.length() != 3 || b.length() != 3 ){
            System.out.println("세 자리 자연수가 아닙니다.");
            return;
        }

        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);

        int B1 = B % 10 ;
        int B2 = (B / 10) % 10 ;
        int B3 = B / 100 ;

        System.out.println(A * B1);
        System.out.println(A * B2);
        System.out.println(A * B3);
        System.out.println(A * B);
    }
}
