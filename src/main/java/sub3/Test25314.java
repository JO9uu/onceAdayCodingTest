package sub3;

import java.util.Scanner;

public class Test25314 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N 받아오기
        int N = sc.nextInt();

        // N은 4의 배수니 4로 나눈 값을 계산
        int M = N / 4 ;

        // M 만큼 long 출력
        for ( int i = 0; i < M; i++ ){
            System.out.println("long ");
        }

        // 반복되는 long 마지막 int 출력
        System.out.println("int");

        sc.close();

    }
}
