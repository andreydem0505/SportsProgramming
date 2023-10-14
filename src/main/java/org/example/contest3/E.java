package org.example.contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class E {
    static class FastScanner {
        private BufferedReader br;
        private StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    static int l, r, t, n;
    static int[] a;
    static HashMap<Integer, Integer> map;

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        n = scanner.nextInt();
        t = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        l = 0;
        r = 0;
        map = new HashMap<>();
        map.put(a[0], 1);
        moveRight();
        int bestL = 0;
        int bestR = r;
        int length = r - l + 1;
        for (int i = 0; i < n - 1; i++) {
            if (map.get(a[l]) > 1)
                map.put(a[l], map.get(a[l]) - 1);
            else
                map.remove(a[l]);
            l++;
            moveRight();
            if (r - l + 1 > length) {
                length = r - l + 1;
                bestL = l;
                bestR = r;
            }
        }
        System.out.println((bestL + 1) + " " + (bestR + 1));
    }

    static void moveRight() {
        while (map.size() <= t && r < n - 1) {
            r++;
            if (map.containsKey(a[r]))
                map.put(a[r], map.get(a[r]) + 1);
            else
                map.put(a[r], 1);
        }
        if (map.size() > t) {
            if (map.get(a[r]) > 1)
                map.put(a[r], map.get(a[r]) - 1);
            else
                map.remove(a[r]);
            r--;
        }
    }
}
