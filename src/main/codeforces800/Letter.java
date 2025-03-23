// LINK: https://codeforces.com/contest/14/problem/A
/*
    DESCRIPTION: A boy Bob likes to draw. Not long ago he bought a rectangular graph 
    (checked) sheet with n rows and m columns. Bob shaded some of the squares on the 
    sheet. Having seen his masterpiece, he decided to share it with his elder brother, 
    who lives in Flatland. Now Bob has to send his picture by post, but because of 
    the world economic crisis and high oil prices, he wants to send his creation, but 
    to spend as little money as possible. For each sent square of paper (no matter 
    whether it is shaded or not) Bob has to pay 3.14 burles. Please, help Bob cut out 
    of his masterpiece a rectangle of the minimum cost, that will contain all the shaded 
    squares. The rectangle's sides should be parallel to the sheet's sides.

    INPUT: The first line of the input data contains numbers n and m (1 ≤ n, m ≤ 50), 
           n — amount of lines, and m — amount of columns on Bob's sheet. The following 
           n lines contain m characters each. Character «.» stands for a non-shaded 
           square on the sheet, and «*» — for a shaded square. It is guaranteed that Bob 
           has shaded at least one square.

    OUTPUT: Output the required rectangle of the minimum cost. Study the output data in 
            the sample tests to understand the output format better.

 */

import java.util.Scanner;
public class Letter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        s.nextLine();

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++){
            grid[i] = s.nextLine().toCharArray();
        }

        int top = n;
        int bottom = -1;
        int left = m;
        int right = -1;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] == '*'){
                    top = Math.min(top, i);
                    bottom = Math.max(bottom, i);
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }

        int height = bottom - top + 1;
        int width = right - left + 1;
        double cost = height * width * 3.14;
        System.out.println(cost);
    }
}
