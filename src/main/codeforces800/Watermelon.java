// LINK: https://codeforces.com/contest/4/problem/A
/* 
    PROBLEM DESCRIPTION:
    Pete and Billy decide to buy a watermelon. The waterlemon weights w kilos. They want to divide 
    the watermelon in such a way that each of the two parts weights an even number of kilos, at the 
    same time, it is not obligatory that the two parts are equal. Each of them should get a part of 
    positive weight.

    INPUT: The first and only input line contains integer number w (1 <= w <= 100) 
           (The weight of the watermelon)
    
    OUTPUT: Print YES if the boys can divide the watermelon into two parts, each weighing an even
    n       number of kilos. Print NO in the opposite case.
 */

import java.util.*;

public class Watermelon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int weight = s.nextInt();
        s.close();
        if (weight == 2){
            System.out.println("NO");
        } else if (weight % 2 == 1){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
