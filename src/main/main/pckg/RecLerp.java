package main.pckg;

import java.util.*;

public class RecLerp {
    public int hi = 12;
    public static void main(String[] args) {
        System.out.println(reclerp(0, 23));
    }

    // count how many calls the lerp takes
    public static double reclerp(double n, double k) {
        if(n >= k - .001) {
            return 1d;
        }
        return 1 + reclerp((n + (k - n) / 10.0), k);
    }
}
