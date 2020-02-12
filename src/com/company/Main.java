package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static int n;
    static int M;
    static int m0;
    static int m1;
    static int[][] gas;

    public static void main(String[] args) {
        input();

    }

    static void input() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));

            String text = reader.readLine();

            String[] parts = text.split(" ");
            n = Integer.parseInt(parts[0]);
            M = Integer.parseInt(parts[1]);
            m0 = Integer.parseInt(parts[2]);
            m1 = Integer.parseInt(parts[3]);

            gas = new int[n][2];
            for (int[] i : gas) {
                i[1] = Integer.MAX_VALUE;
            }

            for (int i = 0; i < n; i++) {
                text = reader.readLine();
                String[] mList = text.split(" ");

                gas[i][0] = Integer.parseInt(mList[0]);
                gas[i][1] = Math.min(gas[i][1], Integer.parseInt(mList[1]));

            }


            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // write your code here
        for (int[] i : gas
        ) {
            System.out.println(i[0]);
        }
        //TODO

    }

    static long OPT(int i) {
        ArrayList<Integer> result = hasPrev(i);
        if (result.size() != 0) {
            for (Integer j :
                    result) {

            }
        }

        return Long.MAX_VALUE;
    }

    static ArrayList<Integer> hasPrev(int i) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = gas[i][0] - m1;
        int right = gas[i][0] - m0;
        i--;
        while (gas[i][0] > left && gas[i][0] < right) {
            result.add(i);
            i--;
        }
        return result;
    }
}
