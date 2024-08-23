package sub1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine(); // 한 줄을 읽고 문자열로 반환
        String b = br.readLine(); // 한 줄을 읽고 문자열로 반환
        String c = br.readLine(); // 한 줄을 읽고 문자열로 반환
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int C = Integer.parseInt(c);

        System.out.println((A+B) % C);
        System.out.println((A % C + B % C) % C );
        System.out.println((A * B) % C);
        System.out.println((A % C * B % C) % C);
    }
}
