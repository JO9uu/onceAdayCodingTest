package sub2;

import java.util.Scanner;

public class Test2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재시각
        int hour = sc.nextInt();
        int min = sc.nextInt();

        // 요리시간
        int cook = sc.nextInt();

        // 현재시각을 분으로 환산하기
        int totalMin = hour * 60 + min;

        // 요리시간 더하기
        int totalCookMin = totalMin + cook;

        // 최종시간 출력
        int finalHour = (totalCookMin / 60 ) % 24;
        int finalMin = totalCookMin % 60;

        System.out.println(finalHour +" " + finalMin );

        sc.close();
    }
}

// https://www.acmicpc.net/problem/2525 오븐 시계
// 첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
// 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.