package com.dikang.algorithm.projecteuler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Nebula Cloud Platform
 * Copyright 2010 Innovation Works Limited, All Rights Reserved.
 * Author: dikang
 */
public class P10 {
    private static String fileName = "/tmp/primes";

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        int n = 2000000;

        long sum = 17;
        int count = 4;
        try {
            writer.write(2 + "\n");
            writer.write(3 + "\n");
            writer.write(5 + "\n");
            writer.write(7 + "\n");

            for (int i=10; i<n; i++) {
                boolean isPrim = true;
                for (int k=2; k<=Math.sqrt(i); k++) {
                    if (i % k ==0) {
                        isPrim = false;
                        break;
                    }
                }

                if (isPrim) {
                    writer.write(i + "\n");
                    sum += i;
                    count ++;

                    if (count == 10001) {
                        System.out.println(i);
                    }
                }

            }

        } finally {
            writer.close();

            System.out.println(sum);
            System.out.println(count);
        }

    }
}
