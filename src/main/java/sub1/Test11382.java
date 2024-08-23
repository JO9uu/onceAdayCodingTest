package sub1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11382 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄에 세 개의 숫자를 입력받음
        String[] inputs = br.readLine().split(" ");

        // 각 숫자를 long으로 변환
        long A = Long.parseLong(inputs[0]);
        long B = Long.parseLong(inputs[1]);
        long C = Long.parseLong(inputs[2]);
        
        // 세 숫자의 합을 출력
        System.out.println(A+B+C);

        }
    }

