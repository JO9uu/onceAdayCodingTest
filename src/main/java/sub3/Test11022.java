package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11022 {
    public static void main(String[] args) throws IOException {
        // 이전 예제와 코드 자체는 비슷해보이고 출력만 신경쓰면 될 듯??

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 개수 T 설정
        int T = Integer.parseInt(br.readLine());

        // 반복문 설정
        for(int i = 1; i <=T; i++){
            String[] numbers = br.readLine().split(" ");
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);

            // 출력 형식 확인
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " +  (A + B));
        }

        // 스트림 닫기
        br.close();
        System.out.println(" 종료 되었습니다. ");
    }
}
