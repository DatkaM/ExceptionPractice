package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> evenNumber = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1, 100));
            if (numbers.get(i) % 2 == 1) {
                oddNumber.add(numbers.get(i));
            } else if (numbers.get(i) % 2 == 0) {
                evenNumber.add(numbers.get(i));
            }
        }
        System.out.print("Numbers:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
            if (i == 25) {
                System.out.print("\n " + numbers.get(i)+ " ");
            }
        }
        System.out.println();
        System.out.println("Tak sandar: " + oddNumber);
        System.out.println("Jup sandar: " + evenNumber);

    }
}
