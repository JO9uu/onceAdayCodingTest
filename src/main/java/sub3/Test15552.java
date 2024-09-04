package sub3;

import java.io.*;

public class Test15552 {
    // IOException 은 입출력시 예외 처리
    public static void main(String[] args) throws IOException {
        // 입력 메소드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출력 메소드
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // T는 최대 1,000,000까지, readLine로 한 줄을 읽음
        int T = Integer.parseInt(br.readLine());

        // 각 테스트 케이스에 대해 반복문 처리
        for (int i = 0; i < T; i++){

            // 한 줄을 읽어 공백기준으로 변수 처리하려면 split(" ") 사용
            String[] numbers = br.readLine().split(" ");

            // 위의 변수에서 첫번째 수를 A 두번째 수를 B로 지정
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);

            // 결과를 출력에 저장
            bw.write((A + B) + "\n");
        }

        // 반복문이 끝난 후 버퍼의 내용을 출력(flush)
        bw.flush();

        // 스트림 닫기
        br.close();
        bw.close();
    }
}
