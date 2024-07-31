package Level_3;

import java.util.Scanner;

public class BeckJoon_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        for (int i = 0; i < a; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            int add = a + b;
            System.out.println(add);
        }
        sc.close();
    }
}