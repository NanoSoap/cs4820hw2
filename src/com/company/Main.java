package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int[][] gas = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));

            String text = reader.readLine();

            String[] parts = text.split(" ");
            int n = Integer.parseInt(parts[0]);
            int M = Integer.parseInt(parts[1]);
            int m0 = Integer.parseInt(parts[2]);
            int m1 = Integer.parseInt(parts[3]);

            gas = new int[n][2];


            for (int i = 0; i < n; i++) {
                text = reader.readLine();
                String[] mList = text.split(" ");

                gas[i][0] = Integer.parseInt(mList[0]);
                gas[i][1] = Integer.parseInt(mList[1]);

            }



            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        // write your code here
        for (int[] i:gas
        ){
            System.out.println(i[0]);
        }           
        //TODO
        
    }

}
