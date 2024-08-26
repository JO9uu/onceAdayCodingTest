package sub3;

import java.util.Scanner;

// 문제: n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
public class Test8393 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = 0;

        for( int i = 0; i <= n; i++ ){

        m += i;

        }

        // 결과 출력
        System.out.println(m);

        sc.close();

    }
}
