package Level_3;

import java.util.Scanner;

public class BeckJoon_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int div = N / 4;
        for (int i = 0; i < div; i++) {
            System.out.print("long ");
        }
        System.out.print("int");

        sc.close();
    }
}
