package sub3;

import java.io.*;

public class Test11021 {
    public static void main(String[] args) throws IOException {

        // Buffered로 입출력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // T는 최대 1,000,000까지, readLine로 한 줄을 읽음
        int T = Integer.parseInt(br.readLine());

        // 케이스에 대해 반복문 처리, case1부터 시작이라 i를 1로 시작
        for( int i = 1; i<=T; i++){

            // 한 줄 읽고 공백 기준으로 개별처리
            String[] numbers = br.readLine().split(" ");

            // 공백기준 첫번째 수 A, 두번째 수 B
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);

            // 출력형식 지정
            System.out.println("Case #" + i + ": " + (A + B));

        }

        // 스트림 닫기
        br.close();
    }
}
