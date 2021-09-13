package self.hackerearth.java.basics.io;

import java.util.Scanner;

public class MaximumBorders {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] a = new char[n][m];
            String s = "";

            for (int i = 0; i < a.length; i++) {
                s = sc.next();
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = s.charAt(j);
                }
            }


            int z = 0;
            int count = 0;
            int count2 = 0;
            int count3 = 0;
            int x = 0;
            int y = 0;

            for (int i = 0; i < a.length; i++) {

                count = 0;
                count2 = 0;
                count3 = 0;

                for (int j = 0; j < a[i].length; j++) {

                    if (z < n && a[z][j] == '#') {
                        count++;
                    }
                    if (a[i][j] == '#') {
                        count2++;
                    }
                    if (i + 1 < n && a[i + 1][j] == '.') {
                        count3++;
                        if (count3 == m) {
                            x = count > count2 ? count : count2;
                            y = x > y ? x : y;
                            z = i + 2;
                        }
                    }
                }
            }

            if (y == 0) {
                y = count > count2 ? count : count2;
            } else {
                x = count > count2 ? count : count2;
                y = x > y ? x : y;
            }

            System.out.println(y);
            T--;
        }
    }

}
