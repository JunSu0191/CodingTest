package Level_3;

import java.util.Scanner;

public class BeckJoon_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = a; i <= a; i++) {
            for (int j = 1; j <= 9; j++) {
                int b = a * j;
                System.out.println(a + " * " + j + " = " + b);                
            }
        }

        sc.close();
    }
    
}
