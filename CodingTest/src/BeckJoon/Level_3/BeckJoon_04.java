package Level_3;

import java.util.Scanner;

public class BeckJoon_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다
        int X = sc.nextInt();
        // 둘째 줄에는 적힌 구매한 물건의 종류의 수 N이 주어진다.
        int N = sc.nextInt();
        // 하나의 총 금액
        int add = 0;
        // 전체 총 금액
        int p = add;
        for (int i = 1; i <= N; i++) {
            // 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
            int a = sc.nextInt();
            int b = sc.nextInt();
            add = a * b;
            p += add;
        }
        System.out.println(p);
        if (X == p) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
