package Level_3;

import java.util.Scanner;

public class BeckJoon_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int add = a + b;
            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(add).append("\n");
        }
        sc.close();
        
        System.out.print(sb.toString());
    }
}
