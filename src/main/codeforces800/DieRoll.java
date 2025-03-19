// LINK: https://codeforces.com/contest/9/problem/A
/*
    PROBLEM OVERVIEW:
    Yakko, Wakko, and Dot decide to go on a trip. They can only go to one of three places. 
    Yakko -> Pennsylvania
    Wakko -> Tasmania
    Dot   -> Transylvania

    Each of Yakko, Wakko, and Dot roll an ordinary six-sided die, and the one with the highest 
    amount of points will get to choose where they go. 
    Yakko -> Y points
    Wakko -> W points

    What are the chances that Dot gets to go to Transylvania? If Dot has the same amount of 
    points as Yakko or Wakko, they will let Dot win.

    INPUT: One line of input, two natural numbers Y and W.
    OUTPUT: An irreducible fraction A/B. If the probability is 0, return 0/1. If the probability
    is 1, return 1/1.

 */

import java.util.*;
public class DieRoll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Y = s.nextInt();
        int W = s.nextInt();
        s.close();

        int max = Math.max(Y, W);
        int favorableOutcomes = 6 - max + 1;
        int gcd = gcd(favorableOutcomes, 6);

        int numerator = favorableOutcomes / gcd;
        int denominator = 6 / gcd;

        System.out.print(numerator + "/" + denominator);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
