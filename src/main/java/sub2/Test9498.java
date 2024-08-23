package sub2;

import java.util.Scanner;

public class Test9498 {

    public static void main(String[] args) {
                // Scanner 객체 생성
                Scanner scanner = new Scanner(System.in);

                // 점수 입력 받기
                int score = scanner.nextInt();

                // 학점 분류 및 출력
                if (score >= 90 && score <= 100) {
                    System.out.println("A");
                } else if (score >= 80 && score <= 89) {
                    System.out.println("B");
                } else if (score >= 70 && score <= 79) {
                    System.out.println("C");
                } else if (score >= 60 && score <= 69) {
                    System.out.println("D");
                } else if (score >= 0 && score <= 59) {
                    System.out.println("F");
                }

                // Scanner 객체 닫기
                scanner.close();
            }
        }
