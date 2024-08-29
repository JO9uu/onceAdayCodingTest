package sub3;

import java.util.Scanner;

public class Test25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 영수증에 적힌 총 금액 X
        int X = sc.nextInt();

        // 구매한 물건이 종류 수 N
        int N = sc.nextInt();

        // 실제 계산된 총 금액
        int TX = 0;

        // 물건의 가격 a 와 개수 b 입력 받기
        for ( int i = 0; i < N; i++ ){
            int a = sc.nextInt();
            int b = sc.nextInt();

            TX += a * b;

        }

        // 영수증 총 금액과 실제 계산된 총 금액 비교
        if (TX == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}
