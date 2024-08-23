package sub2;

import java.util.Scanner;

public class Test2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 시간, 분 입력
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(B < 45) {
            A --;
            B = 60-(45-B);

            if (A < 0 ){ // -1의 값이 0보다 작으면 23시로 바꿈
                A = 23;
            }
            System.out.println(A + " " + B);
        }else{
            System.out.println(A + " " + (B - 45));
        }
        sc.close();
}
}

// https://www.acmicpc.net/problem/2884 알람 시계