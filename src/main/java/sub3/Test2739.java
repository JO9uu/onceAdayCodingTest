package sub3;

import java.util.Scanner;

public class Test2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사용자가 입력한 정수 N

        // 구구단 조건 설정
        for (int i = 1; i <= 9; i++){
            System.out.println(N + " * " + i + " = " + (N * i));
        }

        sc.close();
    }
}

// https://www.acmicpc.net/problem/2739 구구단