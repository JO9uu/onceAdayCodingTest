package sub2;

import java.util.Scanner;

public class Test2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int prize;

        // 세 주사위가 모두 같음
        if(a == b && b == c){
            prize = 10000 + a * 1000;

        // 두 주사위가 같음1( a가 b와 같거나 a가 c와 같거나)
        }else if ( a == b || a == c ){

            prize = 1000 + a * 100;
        // 두 주사위가 같음2( b와 c가 같음)
        }else if( b == c ){
            prize = 1000 + b * 100;
        }else {
        // 주사위가 모두 다름
            prize = Math.max(a, Math.max(b, c)) * 100;
        }

        System.out.println(prize);

    }
}
