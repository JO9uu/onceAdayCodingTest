package sub3;

import java.util.Scanner;

public class Test10950 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 입력 받기

        // 테스트 케이스 개수 T 설정
        int T = sc.nextInt();

        // 반복문으로 A + B 출력

        for ( int i = 0; i < T; i++){

            // 정수 A, B 받기
            int A = sc.nextInt();

            int B = sc.nextInt();

            System.out.println(A + B);
        }
        sc.close();
    }


}
