package questions.graphs;

import javax.swing.*;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.min;

public class MinDays2EatOranges {
    public static void main(String[] args) {
        System.out.println(minDays2(673));
    }
    public static int minDays(int n){
        if(n%3 == 0 && n%2 == 0){
            return 1 + min(minDays(n-1), min(minDays(n/3), minDays(n/2)));
        } else if(n%3 == 0) {
            return 1 + min(minDays(n-1), minDays(n/3));
        } else if(n%2 == 0){
            return 1 + min(minDays(n-1), minDays(n/2));
        } else if(n == 1){
            return 1;
        } else {
            return 1 + minDays(n-1);
        }
    }

    static Map<Integer, Integer> graph = new HashMap<>();
    public static int minDays2(int n){
        if (n <= 1)
            return n;
        if (!graph.containsKey(n))
            graph.put(n, 1 + Math.min(n % 2 + minDays2(n / 2), n % 3 + minDays2(n / 3)));
        return graph.get(n);
    }
}